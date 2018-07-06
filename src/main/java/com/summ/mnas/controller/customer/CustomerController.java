package com.summ.mnas.controller.customer;


import com.summ.mnas.Consts;
import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.JCustomer;
import com.summ.mnas.model.JCustomerHouse;
import com.summ.mnas.model.JCustomerStatment;
import com.summ.mnas.model.JWithdrawal;
import com.summ.mnas.model.others.GetWXResult;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.model.others.PayCallBackObj;
import com.summ.mnas.model.request.CustomerRechargeReq;
import com.summ.mnas.utils.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author summ
 * @since 2018-05-14
 */
@Api(tags = "客户信息模块")
@Controller
@RequestMapping(value = "/customer", method = RequestMethod.POST)
public class CustomerController extends AutoMapperController {

    @ApiOperation(value = "更新基本信息")
    @ResponseBody
    @RequestMapping("/update")
    public Object updateCustomer(@RequestBody JCustomer jCustomer) {
        try {
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功", jCustomerMapper.updateById(jCustomer));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    @ApiOperation(value = "基本信息")
    @ResponseBody
    @RequestMapping("/detail")
    public Object getCustomerDetail(@RequestBody JCustomer jCustomer1) {
        try {
            JCustomer jCustomer = jCustomerMapper.selectById(jCustomer1.getCustomerId());
            List<JCustomerHouse> jCustomerHouseList = jCustomerHouseMapper.getHouseByCustomerId(jCustomer1.getCustomerId());
            if (jCustomerHouseList.size() > 0) {
                jCustomer.setCustomerHouseList(jCustomerHouseList);
            }
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功", jCustomer);
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    @ApiOperation(value = "余额提现")
    @ResponseBody
    @RequestMapping("/withdrawal")
    public Object insertWithdrawal(@RequestBody JWithdrawal jWithdrawal) {
        try {
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功", jWithdrawalMapper.insert(jWithdrawal));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    @ApiOperation(value = "充值")
    @ResponseBody
    @RequestMapping("/recharge")
    public Object insertRecharge(@RequestBody CustomerRechargeReq customerRechargeReq) {
        try {
            JCustomer jCustomer = jCustomerMapper.selectById(Long.valueOf(customerRechargeReq.getCustomerId()));
            if (StringUtil.isBlank(jCustomer.getWeiXinOpenId())) {
                return new ModelRes(ModelRes.Status.FAILED, "该账户未绑定微信,请绑定后重试", jCustomer);
            }

            String orderId = OrderUtil.generateStamentNumber(customerRechargeReq.getCustomerId());
            JCustomerStatment jCustomerStatment = new JCustomerStatment(orderId,
                    jCustomer.getCustomerId(), 0, 0, 0,
                    0, 0, 0, "", 0.0, null,
                    new Date(), 38, new BigDecimal(customerRechargeReq.getMoney()), 45, 0, customerRechargeReq.getTerminal(), 54, jCustomer.getCustomerBalance(), "", "");
            jCustomerStatmentMapper.insert(jCustomerStatment);

            return WeixinUtil.weiXinPay(orderId, jCustomer.getWeiXinOpenId(), customerRechargeReq.getMoney(), Consts.serverUrl + "/customer/recharge/callback",
                    new PayCallBackObj(jCustomer.getCustomerId(), jCustomer.getCustomerName(), jCustomer.getCustomerPhone(), 0, "", 0), "家有管家-余额充值");

        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    @ApiOperation(value = "充值回调")
    @RequestMapping("/recharge/callback")
    @ResponseBody
    public String rechargeCallback(HttpServletRequest request) throws Exception {
        String inputLine;
        StringBuffer notifyXml = new StringBuffer();
        try {
            while ((inputLine = request.getReader().readLine()) != null) {
                notifyXml.append(inputLine);
                System.out.println(" ");
            }
            request.getReader().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("notifyXml:" + notifyXml.toString());
        GetWXResult get = (GetWXResult) JsonUtil.getObjectFromXML(notifyXml.toString(), GetWXResult.class);
        System.out.println("notifyObj:" + get.toString());
        if (get.getResult_code().equals("SUCCESS")) {
            Map map = new HashMap();
            map.put("statmentCustomer", get.getOut_trade_no());
            List<JCustomerStatment> jCustomerStatmentList = jCustomerStatmentMapper.selectByMap(map);
            for (JCustomerStatment jCustomerStatment : jCustomerStatmentList) {
                jCustomerStatment.setBalance(jCustomerStatment.getBalance().add(new BigDecimal(Double.valueOf(get.getTotal_fee())).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP)));
                jCustomerStatment.setSerialNumber(get.getTransaction_id());
                jCustomerStatment.setStatus(53);
                jCustomerStatment.setChargeDate(DateUtil.parseStringToDate(get.getTime_end(), DateUtil.PATTERN_yyyyMMddHHmmss));
                jCustomerStatment.setNotifyDate(new Date());

                JCustomer jCustomer = jCustomerMapper.selectById(Long.valueOf(jCustomerStatment.getCustomerId()));
                jCustomer.setCustomerBalance(jCustomer.getCustomerBalance().add(jCustomerStatment.getChargeMoney()));
                jCustomerStatmentMapper.updateById(jCustomerStatment);
                jCustomerMapper.updateById(jCustomer);
            }
            return "<xml><return_code><![CDATA[SUCCESS]]></return_code> <return_msg><![CDATA[OK]]></return_msg></xml>";
        }
        String result = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>" + "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
        return result;
    }

}

