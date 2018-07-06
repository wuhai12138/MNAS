package com.summ.mnas.mapper;

import com.summ.mnas.model.JOrderContract;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.summ.mnas.model.request.OrderReq;
import com.summ.mnas.model.response.OrderContractRes;
import com.summ.mnas.model.response.OrderRes;
import io.swagger.models.auth.In;
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
public interface JOrderContractMapper extends BaseMapper<JOrderContract> {

    List<OrderRes> getContractDetail(@Param("orderReq") OrderReq orderReq);
}
