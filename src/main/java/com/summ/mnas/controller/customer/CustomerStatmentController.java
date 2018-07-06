package com.summ.mnas.controller.customer;


import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.JCustomerStatment;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.model.request.CustomerPrepaidReq;
import com.summ.mnas.model.request.CustomerStatmentReq;
import com.summ.mnas.model.response.CustomerPrepaidRes;
import com.summ.mnas.model.response.CustomerStatmentRes;
import com.summ.mnas.utils.ResponseUtil;
import com.summ.mnas.utils.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jygj_7500
 * @date 17/11/29
 */
@Api(tags = "客户对账单")
@RestController
@RequestMapping(value = "/customer/statment",method = RequestMethod.POST)
public class CustomerStatmentController extends AutoMapperController {

    /**
     * CRUD for customer statment
     *
     * @param jCustomerStatment
     * @return
     */

    @ApiOperation(value = "添加客户对账单")
    @ResponseBody
    @RequestMapping("/insert")
    public Object insert(@RequestBody JCustomerStatment jCustomerStatment) {
        try {
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功!", jCustomerStatmentMapper.insert(jCustomerStatment));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    @ApiOperation(value = "查找客户对账单")
    @ResponseBody
    @RequestMapping("/find")
    public Object find(@RequestBody CustomerStatmentReq customerStatmentReq) {
        try {
            customerStatmentReq.setPage(customerStatmentReq.getSize() * (customerStatmentReq.getPage() - 1));
            List<CustomerStatmentRes> customerStatmentResList= jCustomerStatmentMapper.getStatmentList(customerStatmentReq);
            /***/
            for (CustomerStatmentRes customerStatmentRes:customerStatmentResList){
                if (!StringUtil.isBlank(String.valueOf(customerStatmentRes.getOrderType()))){
                    if (customerStatmentRes.getOrderType()==164){
                        customerStatmentRes.setNannyName(jCustomerStatmentMapper.getNannyName(customerStatmentRes.getOrderId()));
                    }
                }
            }
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功 !", ResponseUtil.List2Map(customerStatmentResList));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

}
