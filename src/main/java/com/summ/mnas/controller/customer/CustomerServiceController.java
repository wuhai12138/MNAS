package com.summ.mnas.controller.customer;

import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.mongodb.CustomerService;
import com.summ.mnas.model.others.ModelRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "客户服务计划书模块")
@RestController

@RequestMapping(value = "/customer/service",method = RequestMethod.POST)
public class CustomerServiceController extends AutoMapperController {

    @ApiOperation(value = "查找服务计划书")
    @ResponseBody
    @RequestMapping("/find")
    public Object find(@RequestBody CustomerService customerService) {
        try {
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功",customerServiceMapper.findByServiceId(customerService.getServiceId()));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }
    @ApiOperation(value = "新增服务计划书")
    @ResponseBody
    @RequestMapping("/insert")
    public Object insert(@RequestBody CustomerService customerService) {
        try {
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功",customerServiceMapper.insertService(customerService));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }
    @ApiOperation(value = "更新服务计划书")
    @ResponseBody
    @RequestMapping("/update")
    public Object update(@RequestBody CustomerService customerService) {
        try {
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功",customerServiceMapper.updateByServiceId(customerService));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }
}
