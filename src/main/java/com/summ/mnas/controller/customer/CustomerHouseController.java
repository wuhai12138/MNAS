package com.summ.mnas.controller.customer;


import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.JCustomerHouse;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.utils.BaiduAPIUtil;
import com.summ.mnas.utils.ResponseUtil;
import com.summ.mnas.utils.TencentMapUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author summ
 * @since 2018-05-14
 */
@Api(tags = "客户房产模块")
@RestController
@RequestMapping(value = "/customer/house",method = RequestMethod.POST)
public class CustomerHouseController extends AutoMapperController {

    @ApiOperation(value = "添加房产",notes = "")
    @ResponseBody
    @RequestMapping("/insert")
    public Object insertHouse(@RequestBody JCustomerHouse jCustomerHouse){
        try {
            Map<String, Double> baiduMap = TencentMapUtil.getLngAndLat("上海市" + jCustomerHouse.getHouseAddress());
            if (baiduMap == null) {
                return new ModelRes(ModelRes.Status.FAILED, "获取不到该地址，请重新输入 !");
            }else {
                jCustomerHouse.setLatitude(baiduMap.get("lat"));
                jCustomerHouse.setLongitude(baiduMap.get("lng"));
            }

            jCustomerHouseMapper.insert(jCustomerHouse);
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    @ApiOperation(value = "删除房产",notes = "根据房产id删除房产 houseId")
    @ResponseBody
    @RequestMapping("/delete")
    public Object deleteHouse(@RequestBody JCustomerHouse jCustomerHouse){
        try {
            JCustomerHouse jCustomerHouse1 = new JCustomerHouse();
            jCustomerHouse1.setHouseId(jCustomerHouse.getHouseId());
            jCustomerHouse1.setIsDel(17);
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功",jCustomerHouseMapper.updateById(jCustomerHouse1));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    @ApiOperation(value = "查找房产",notes = "根据客户id查找房产:customerId")
    @ResponseBody
    @RequestMapping("/find")
    public Object findHouse(@RequestBody JCustomerHouse jCustomerHouse){
        try {
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功",ResponseUtil.List2Map(jCustomerHouseMapper.getHouseByCustomerId(jCustomerHouse.getCustomerId())));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

}

