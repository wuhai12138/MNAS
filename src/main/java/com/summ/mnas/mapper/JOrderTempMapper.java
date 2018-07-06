package com.summ.mnas.mapper;

import com.summ.mnas.model.JOrderTemp;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.summ.mnas.model.request.OrderReq;
import com.summ.mnas.model.response.OrderRes;
import com.summ.mnas.model.response.OrderTempRes;
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
public interface JOrderTempMapper extends BaseMapper<JOrderTemp> {

    List<OrderRes> getTempDetail(@Param("orderReq") OrderReq orderReq);
}
