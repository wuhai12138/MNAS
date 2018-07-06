package com.summ.mnas.mapper;

import com.summ.mnas.model.JCustomerStatment;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.summ.mnas.model.request.CustomerStatmentReq;
import com.summ.mnas.model.response.CustomerStatmentRes;
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
public interface JCustomerStatmentMapper extends BaseMapper<JCustomerStatment> {

    List<CustomerStatmentRes> getStatmentList(@Param("customerStatmentReq") CustomerStatmentReq customerStatmentReq);

    String getNannyName(Integer orderId);
}
