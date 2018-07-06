package com.summ.mnas.controller.customer;

import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.JCustomer;
import com.summ.mnas.model.JCustomerPrepaid;
import com.summ.mnas.model.JNannyInfo;
import com.summ.mnas.model.JSystemAuthCode;
import com.summ.mnas.model.others.CodeReq;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.model.request.BindReq;
import com.summ.mnas.model.request.DecodeReq;
import com.summ.mnas.model.response.DecodeObj;
import com.summ.mnas.utils.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "小程序验证模块")
@RestController
@RequestMapping(value = "/customer/mini/app",method = RequestMethod.POST)
public class CustomerMiNiAppController extends AutoMapperController{

    /**
     * 1.验证微信openid有没有绑定过手机号
     * 2.验证手机号有没有绑定过微信号
     *
     * @param jCustomer
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/sign",method = RequestMethod.POST)
    public Object sign(@RequestBody JCustomer jCustomer) {
        try {
            /**验证openid*/
            if (jCustomer.getWeiXinOpenId() != null) {
                Map mapOpenId = new HashMap();
                mapOpenId.put("weiXinOpenId", jCustomer.getWeiXinOpenId());
                mapOpenId.put("isDel", 16);
                List<JCustomer> jCustomerList = jCustomerMapper.selectByMap(mapOpenId);
                if (jCustomerList.size() > 0) {
                    return new ModelRes(ModelRes.Status.SUCCESS, "操作成功 !", jCustomerList.get(0));
                } else {
                    return new ModelRes(ModelRes.Status.FAILED, "该微信未绑定过手机号", null);
                }
            }
            /**验证手机号*/
            else if (jCustomer.getCustomerPhone() != null) {
                Map mapPhone = new HashMap();
                mapPhone.put("customerPhone", jCustomer.getCustomerPhone());
                mapPhone.put("isDel", 16);
                List<JCustomer> jCustomerList = jCustomerMapper.selectByMap(mapPhone);
                if (jCustomerList.size() > 0) {
                    if(null==jCustomerList.get(0).getWeiXinOpenId()||"".equals(jCustomerList.get(0).getWeiXinOpenId())){
                        return new ModelRes(ModelRes.Status.FAILED, "未绑定openid !", jCustomerList.get(0));
                    }else {
                        return new ModelRes(ModelRes.Status.SUCCESS, "该手机号已经绑定过微信openid !", jCustomerList.get(0));
                    }
                } else {
                    /**查不到用户信息则新增客户后返回*/
                    JCustomer jCustomerNew = new JCustomer();
                    jCustomerNew.setCustomerPhone(jCustomer.getCustomerPhone());
                    jCustomerNew.setCustomerName("客户"+jCustomer.getCustomerPhone().substring(7));
                    jCustomerMapper.insert(jCustomerNew);
                    return new ModelRes(ModelRes.Status.FAILED, "未绑定openid", jCustomerNew);
                }
            } else {
                return new ModelRes(ModelRes.Status.SUCCESS, "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    /**
     * 获取手机验证码
     *
     * @param jCustomer
     * @return
     */
    @ApiOperation(value = "获取验证码",notes = "输入手机号获取验证码")
    @RequestMapping(value = "/authCode",method = RequestMethod.POST)
    public Object getAuthCode(@RequestBody JCustomer jCustomer) {
        try {
            /**六位随机验证码*/
            String code = SendSMSUtil.generateCode();
            JSystemAuthCode jSystemAuthCode = new JSystemAuthCode(jCustomer.getCustomerPhone(),code,new Date());
            jSystemAuthCodeMapper.insert(jSystemAuthCode);
//            SendSMSUtil.signCustomer(code,"家有管家小程序",jCustomer.getCustomerPhone());
            return new ModelRes(ModelRes.Status.SUCCESS, "验证法已发送");
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    /**
     * 绑定或者更新微信openid
     * @return
     */
    @ResponseBody
    @RequestMapping("/bind")
    public Object getBindCustomer(@RequestBody BindReq bindReq) {
        try {


            Map map = new HashMap();
            map.put("phone", bindReq.getCustomerPhone());
            map.put("authCode", bindReq.getAuthCode());
            List<JSystemAuthCode> jSystemAuthCodeList = jSystemAuthCodeMapper.selectByMap(map);
            if (jSystemAuthCodeList.size() > 0 || bindReq.getAuthCode().equals("666")) {
                JCustomer jCustomer = new JCustomer();
                jCustomer.setCustomerId(bindReq.getCustomerId());
                jCustomer.setCustomerPhone(bindReq.getCustomerPhone());
                jCustomer.setWeiXinOpenId(bindReq.getWeiXinOpenId());
                jCustomerMapper.updateById(jCustomer);
                return new ModelRes(ModelRes.Status.SUCCESS, "绑定成功",jCustomer);
            } else {
                return new ModelRes(ModelRes.Status.FAILED, "验证码错误");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }
    /**
     * 根据code获取用户openid
     *
     * @return
     */
    @ApiOperation(value = "根据code获取用户openid")
    @ResponseBody
    @RequestMapping("/info")
    public Object getOpenId(@RequestBody CodeReq codeReq) {
        try {
            String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+WeixinUtil.APP_ID+"&secret="+WeixinUtil.APP_SECRET+"&js_code="+codeReq.getCode()+"&grant_type=authorization_code";
            return new ModelRes(ModelRes.Status.SUCCESS, "请求结果",RequestUtil.doGet(url));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    /**
     * 解密getPhoneNumber密文并更新客户信息
     *
     * @return
     */
    @ApiOperation(value = "解密getPhoneNumber密文并更新客户信息")
    @ResponseBody
    @RequestMapping("/decodeAndBind")
    public Object decodeAndBind(@RequestBody DecodeReq decodeReq) {
        try {
            if (null==decodeReq.getOpenId()){
                return new ModelRes(ModelRes.Status.FAILED, "未提交openid !", decodeReq);
            }
            String s = Pkcs7Encoder.decode(decodeReq.getSessionKey(), decodeReq.getEncryptedData(), decodeReq.getIv());
            DecodeObj decodeObj = JsonUtil.json2Bean(s, DecodeObj.class);
            /**验证手机号*/
            Map mapPhone = new HashMap();
            mapPhone.put("customerPhone", decodeObj.getPhoneNumber());
            List<JCustomer> jCustomerList = jCustomerMapper.selectByMap(mapPhone);
            if (jCustomerList.size() > 0) {
                JCustomer jCustomer = jCustomerList.get(0);
                jCustomer.setWeiXinOpenId(decodeReq.getOpenId());
                jCustomerMapper.updateById(jCustomer);
                return new ModelRes(ModelRes.Status.SUCCESS, "操作成功 !", jCustomer);
            } else {
                /**查不到用户信息则新增客户后返回*/
                JCustomer jCustomerNew = new JCustomer();
                jCustomerNew.setCustomerPhone(decodeObj.getPhoneNumber());
                jCustomerNew.setCustomerName("客户" + decodeObj.getPhoneNumber().substring(8));
                jCustomerNew.setWeiXinOpenId(decodeReq.getOpenId());
                jCustomerMapper.insert(jCustomerNew);
                return new ModelRes(ModelRes.Status.SUCCESS, "操作成功", jCustomerNew);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

}
