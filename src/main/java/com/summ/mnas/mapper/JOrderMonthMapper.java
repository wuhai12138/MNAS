package com.summ.mnas.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.summ.mnas.model.JOrderMonth;
import com.summ.mnas.model.request.OrderReq;
import com.summ.mnas.model.response.OrderRes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author summ
 * @since 2018-05-29
 */
public interface JOrderMonthMapper extends BaseMapper<JOrderMonth> {
    List<OrderRes> getMonthDetail(@Param("orderReq") OrderReq orderReq);
}
