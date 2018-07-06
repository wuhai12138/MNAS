package com.summ.mnas.mapper;

import com.summ.mnas.model.JCouponList;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.summ.mnas.model.request.CustomerCouponReq;
import com.summ.mnas.model.request.OrderTempChargeReq;
import com.summ.mnas.model.response.CustomerCouponListRes;
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
public interface JCouponListMapper extends BaseMapper<JCouponList> {

    List<CustomerCouponListRes> getListById(@Param("customerCouponReq") CustomerCouponReq customerCouponReq);

    /**
     * 获取临时订单不可用优惠券
     * @param orderTempChargeReq
     * @return
     */
    List<CustomerCouponListRes> getUnUseCouponList(@Param("orderTempChargeReq") OrderTempChargeReq orderTempChargeReq);
    /**
     * 获取临时订单可用优惠券
     * @param orderTempChargeReq
     * @return
     */
    List<CustomerCouponListRes> getUsedCouponList(@Param("orderTempChargeReq") OrderTempChargeReq orderTempChargeReq);
}
