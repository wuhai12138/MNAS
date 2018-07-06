package com.summ.mnas.controller.order;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.summ.mnas.Consts;
import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.JCustomerScheduleFeedback;
import com.summ.mnas.model.JOrderSchedule;
import com.summ.mnas.model.JOrderTemp;
import com.summ.mnas.model.JScheduleNanny;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.model.request.ScheduleReq;
import com.summ.mnas.model.response.ScheduleRes;
import com.summ.mnas.utils.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Api(tags = "订单日程模块")
@RestController
@RequestMapping(value = "/order/schedule",method = RequestMethod.POST)
public class OrderScheduleController extends AutoMapperController {

    @ApiOperation(value = "获取订单日程",response = ScheduleRes.class)
    @RequestMapping(value = "/find",method = RequestMethod.POST)
    public Object getOrderSchedule(@RequestBody ScheduleReq scheduleReq){
        try {
            scheduleReq.setPage(scheduleReq.getSize()*(scheduleReq.getPage()-1));

            System.out.println(scheduleReq.getStartDate());
            System.out.println(scheduleReq.getEndDate());
            System.out.println(scheduleReq.getCustomerId());

            List<ScheduleRes> scheduleResList = jOrderScheduleMapper.getOrderSchedule(scheduleReq);

            for (ScheduleRes scheduleRes:scheduleResList){
                if (164==scheduleRes.getOrderType()){
                    JOrderTemp jOrderTemp = jOrderTempMapper.selectById(scheduleRes.getOrderId());
                    scheduleRes.setServiceAmount(jOrderTemp.getServiceAmount());
                }else {
                    scheduleRes.setServiceAmount((scheduleRes.getEndTime()-scheduleRes.getStartTime())/2);
                }
            }

            return new ModelRes(ModelRes.Status.SUCCESS,"操作成功",ResponseUtil.List2Map(scheduleResList));
        }catch (Exception e){
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR,"err",null);
        }
    }


    @ApiOperation(value = "日程提交反馈")
    @RequestMapping(value = "/feedback", method = RequestMethod.POST)
    public Object insertFeedback(@RequestParam("file") MultipartFile file, @RequestParam("scheduleId") Integer scheduleId, @RequestParam("customerId") Integer customerId, @RequestParam("remark") String remark) throws IOException {


        System.out.println("file upload");
        String filePath = null;
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                Pattern pattern = Pattern.compile("\\.[a-z|A-Z]+$");
                Matcher matcher = pattern.matcher(file.getOriginalFilename());
                String fileName = "NSF"+System.currentTimeMillis()+".jpg";
                if (matcher.find()) {
                    // 文件保存路径
//                     filePath = "C:\\Users\\jygj_7500\\Desktop\\upload\\" + System.currentTimeMillis();
                    filePath = Consts.customerScheduleFeedbackUrl + fileName;
                } else {
                    return new ModelRes(ModelRes.Status.FAILED, "上传失败 !");
                }

                // 转存文件
                file.transferTo(new File(filePath));

                JOrderSchedule jOrderSchedule = jOrderScheduleMapper.selectById(scheduleId);
                List<JScheduleNanny> jScheduleNannyList = jScheduleNannyMapper.selectList(new Wrapper<JScheduleNanny>() {
                    @Override
                    public String getSqlSegment() {
                        return "where scheduleId="+jOrderSchedule.getScheduleId();
                    }
                });
                JCustomerScheduleFeedback jCustomerScheduleFeedback = new JCustomerScheduleFeedback();
                jCustomerScheduleFeedback.setNannyId(jScheduleNannyList.get(0).getNannyId());
                jCustomerScheduleFeedback.setScheduleId(jOrderSchedule.getScheduleId());
                jCustomerScheduleFeedback.setCustomerId(jOrderSchedule.getCustomerId());
                jCustomerScheduleFeedback.setPhote(fileName);
                jCustomerScheduleFeedback.setRemark(remark);
                jCustomerScheduleFeedbackMapper.insert(jCustomerScheduleFeedback);
                return new ModelRes(ModelRes.Status.SUCCESS, "上传成功 !");
            } catch (Exception e) {
                e.printStackTrace();
                return new ModelRes(ModelRes.Status.ERROR, "server err !");
            }
        } else {
            return new ModelRes(ModelRes.Status.FAILED, "文件为空 !");
        }
    }

    @ApiOperation(value = "查找日程反馈",notes = "请求参数: customerId")
    @RequestMapping(value = "/feedback/find",method = RequestMethod.POST)
    public Object getFeedback(@RequestBody JCustomerScheduleFeedback jCustomerScheduleFeedback){
        try {

            return new ModelRes(ModelRes.Status.SUCCESS,"操作成功",ResponseUtil.List2Map(jCustomerScheduleFeedbackMapper.selectList(new Wrapper<JCustomerScheduleFeedback>() {
                @Override
                public String getSqlSegment() {
                    return "where isDel=16 and customerId="+jCustomerScheduleFeedback.getCustomerId();
                }
            })));
        }catch (Exception e){
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR,"err",null);
        }
    }

    @ApiOperation(value = "添加日程评价",notes = "请求参数: scheduleId assess评价内容 staring评价星级 nannyId 服务师id")
    @RequestMapping(value = "/comment/insert",method = RequestMethod.POST)
    public Object insertComment(@RequestBody JScheduleNanny jScheduleNanny){
        try {
        List<JScheduleNanny> jScheduleNannyList = jScheduleNannyMapper.selectList(new Wrapper<JScheduleNanny>() {
            @Override
            public String getSqlSegment() {
                return "where nannyId="+jScheduleNanny.getNannyId()+" and scheduleId="+jScheduleNanny.getScheduleId();
            }
        });

        for (JScheduleNanny jScheduleNanny1 : jScheduleNannyList){
            /**状态改为已评价*/
            jScheduleNanny1.setAssess(jScheduleNanny.getAssess());
            jScheduleNanny1.setStaring(jScheduleNanny.getStaring());
            jScheduleNanny1.setCommentStatus(290);
            jScheduleNanny1.setCommentDate(new Date());
            jScheduleNannyMapper.updateById(jScheduleNanny1);
        }
            return new ModelRes(ModelRes.Status.SUCCESS,"操作成功",null);

        }catch (Exception e){
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR,"err",null);
        }
    }
}








