package com.summ.mnas.mapper;

import com.summ.mnas.model.JOrderYears;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.summ.mnas.model.request.OrderReq;
import com.summ.mnas.model.response.OrderRes;
import com.summ.mnas.model.response.OrderYearsRes;
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
public interface JOrderYearsMapper extends BaseMapper<JOrderYears> {
    List<OrderRes> getYearDetail(@Param("orderReq") OrderReq orderReq);

}
