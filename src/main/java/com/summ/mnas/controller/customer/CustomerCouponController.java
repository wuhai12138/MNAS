package com.summ.mnas.controller.customer;


import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.model.request.CustomerCouponReq;
import com.summ.mnas.model.response.CustomerCouponListRes;
import com.summ.mnas.utils.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jygj_7500
 * @date 17/11/28
 */
@Api(tags = "客户优惠券模块")
@RestController
@RequestMapping(value = "/customer/coupon",method = RequestMethod.POST)
public class CustomerCouponController extends AutoMapperController {

    /**
     * CRUD for customer coupon
     * @param
     * @return
     */

    @ApiOperation(value = "查询客户优惠券")
    @ResponseBody
    @RequestMapping("/find")
    public Object find(@RequestBody CustomerCouponReq customerCouponReq){
        try {
            customerCouponReq.setPage((customerCouponReq.getPage()-1)*customerCouponReq.getSize());
            List<CustomerCouponListRes> customerCouponListResList = jCouponListMapper.getListById(customerCouponReq);
            for (CustomerCouponListRes customerCouponListRes : customerCouponListResList){
                if (customerCouponListRes.getCouponStatus()==32){
                    if (customerCouponListRes.getValidTime().before(new Date())){
                        customerCouponListRes.setCouponStatus(33);
                        customerCouponListRes.setCouponStatusInfo("已过期");
                    }
                }
            }
            return new ModelRes(ModelRes.Status.SUCCESS,"操作成功 !", ResponseUtil.List2Map(customerCouponListResList));
        }catch (Exception e){
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

}
