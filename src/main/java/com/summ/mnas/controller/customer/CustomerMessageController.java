package com.summ.mnas.controller.customer;


import com.summ.mnas.Consts;
import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.*;
import com.summ.mnas.model.others.GetWXResult;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.model.others.PayCallBackObj;
import com.summ.mnas.model.request.CustomerRechargeReq;
import com.summ.mnas.utils.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author summ
 * @since 2018-05-14
 */
@Api(tags = "客户投诉模块")
@RestController
@RequestMapping(value = "/customer/message",method = RequestMethod.POST)
public class CustomerMessageController extends AutoMapperController {

    @ApiOperation(value = "添加投诉",notes = "customerId客户id content投诉内容")
    @ResponseBody
    @RequestMapping("/insert")
    public Object updateCustomer(@RequestBody JCustomerMessage jCustomerMessage) {
        try {
            jCustomerMessage.setMessageType(217);
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功",jCustomerMessageMapper.updateById(jCustomerMessage));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

}

