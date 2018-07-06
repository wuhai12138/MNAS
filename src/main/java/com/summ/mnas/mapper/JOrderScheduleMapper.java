package com.summ.mnas.mapper;

import com.summ.mnas.model.JOrderSchedule;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.summ.mnas.model.request.ScheduleReq;
import com.summ.mnas.model.response.ScheduleRes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author summ
 * @since 2018-05-15
 */
public interface JOrderScheduleMapper extends BaseMapper<JOrderSchedule> {

    List<ScheduleRes> getOrderSchedule(@Param("scheduleReq")ScheduleReq scheduleReq);

}
