package com.summ.mnas.controller.order;

import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.JOrderRefund;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.model.request.OrderRefundReq;
import com.summ.mnas.utils.JsonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/order/refund", method = RequestMethod.POST)
@Api(tags = "订单退款模块")
public class OrderRefundController extends AutoMapperController {

    @ApiOperation(value = "申请退款")
    @RequestMapping("/insert")
    public Object insertOrderRefund(@RequestBody JOrderRefund jOrderRefund) {
        try {
            jOrderRefund.setCreateDate(new Date());
            return new ModelRes(ModelRes.Status.SUCCESS, "", jOrderRefundMapper.insert(jOrderRefund));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err", null);
        }
    }

    @ApiOperation(value = "查看退款列表")
    @RequestMapping("/find")
    public Object findOrderRefund(@RequestBody OrderRefundReq orderRefundReq) {
        try {
            return new ModelRes(ModelRes.Status.SUCCESS, "", jOrderRefundMapper.selectByMap(JsonUtil.Obj2Map(orderRefundReq)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err", null);
        }
    }
}
