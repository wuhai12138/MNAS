package com.summ.mnas.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.summ.mnas.model.JCustomerPrepaid;
import com.summ.mnas.model.request.CustomerPrepaidReq;
import com.summ.mnas.model.response.CustomerPrepaidRes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author summ
 * @since 2018-06-11
 */
public interface JCustomerPrepaidMapper extends BaseMapper<JCustomerPrepaid> {

    List<CustomerPrepaidRes> getCustomerPrepaidList(@Param("customerPrepaidReq") CustomerPrepaidReq customerPrepaidReq);
}
