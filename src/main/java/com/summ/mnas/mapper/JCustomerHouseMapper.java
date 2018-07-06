package com.summ.mnas.mapper;

import com.summ.mnas.model.JCustomerHouse;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author summ
 * @since 2018-05-14
 */
public interface JCustomerHouseMapper extends BaseMapper<JCustomerHouse> {

    List<JCustomerHouse> getHouseByCustomerId(Integer customerId);

}
