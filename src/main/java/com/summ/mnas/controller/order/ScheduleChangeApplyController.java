package com.summ.mnas.controller.order;


import com.baomidou.mybatisplus.mapper.Wrapper;
import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.JOrderSchedule;
import com.summ.mnas.model.JScheduleChangeApply;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.utils.DateUtil;
import com.summ.mnas.utils.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Api(tags = "日程调单模块")
@RestController
@RequestMapping(value = "/order/schedule",method = RequestMethod.POST)
public class ScheduleChangeApplyController extends AutoMapperController {

    @ApiOperation(value = "提交调单申请",notes = "customerId,scheduleId,nannyId,applyType调单申请类型查字典表,scheduleDate变更后的日程日期,startTime变更后开始时间id,endTime变更后结束时间id,customerReason变更原因")
    @RequestMapping(value = "/change/apply")
    public Object orderScheduleChange(@RequestBody JScheduleChangeApply jScheduleChangeApply){
        try {
            /**根据客户和时间限制申请次数*/
            Integer customerId=jScheduleChangeApply.getCustomerId();
            jScheduleChangeApply.setCreateDate(new Date());
            Date date = jScheduleChangeApply.getCreateDate();
            Calendar startCalendar = Calendar.getInstance();
            startCalendar.setTime(date);
            startCalendar.set(Calendar.DAY_OF_MONTH,1);
            Calendar endCalendar = Calendar.getInstance();
            endCalendar.setTime(date);
            endCalendar.set(Calendar.DAY_OF_MONTH,endCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
            List<JScheduleChangeApply> jScheduleChangeApplyList = jScheduleChangeApplyMapper.getScheduleChangeApply(customerId,startCalendar.getTime(),endCalendar.getTime());
            if (jScheduleChangeApplyList.size()>0){
                return new ModelRes(ModelRes.Status.FAILED,"当月申请次数已用完",null);
            }
            jScheduleChangeApplyMapper.insert(jScheduleChangeApply);
            JOrderSchedule jOrderSchedule = new JOrderSchedule();
            jOrderSchedule.setScheduleId(jScheduleChangeApply.getScheduleId());
            jOrderSchedule.setScheduleStatus(310);
            jOrderScheduleMapper.updateById(jOrderSchedule);
            return new ModelRes(ModelRes.Status.SUCCESS,"操作成功",null);
        }catch (Exception e){
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR,"err",null);
        }
    }

    @ApiOperation(value = "查找历史调单申请",notes = "customerId")
    @RequestMapping(value = "/change/find")
    public Object find(@RequestBody JScheduleChangeApply jScheduleChangeApply){
        try {
            return new ModelRes(ModelRes.Status.SUCCESS,"操作成功",ResponseUtil.List2Map(jScheduleChangeApplyMapper.getChangeByCustomer(jScheduleChangeApply.getCustomerId())));
        }catch (Exception e){
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR,"err",null);
        }
    }
    @ApiOperation(value = "取消调单申请",notes = "applyId")
    @RequestMapping(value = "/change/cancel")
    public Object cancel(@RequestBody JScheduleChangeApply jScheduleChangeApply){
        try {
            return new ModelRes(ModelRes.Status.SUCCESS,"操作成功",jScheduleChangeApplyMapper.deleteById(jScheduleChangeApply.getApplyId()));
        }catch (Exception e){
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR,"err",null);
        }
    }
}
