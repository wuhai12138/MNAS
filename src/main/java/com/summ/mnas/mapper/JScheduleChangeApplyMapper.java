package com.summ.mnas.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.summ.mnas.model.JScheduleChangeApply;
import com.summ.mnas.model.response.ScheduleChangeApplyRes;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author summ
 * @since 2018-06-15
 */
public interface JScheduleChangeApplyMapper extends BaseMapper<JScheduleChangeApply> {

    List<ScheduleChangeApplyRes> getChangeByCustomer(Integer customer);

    List<JScheduleChangeApply> getScheduleChangeApply(@Param("customerId") Integer customerId, @Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
