package com.summ.mnas.controller.shop;

import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.JCustomerHouse;
import com.summ.mnas.model.JShop;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.utils.BaiduAPIUtil;
import com.summ.mnas.utils.ResponseUtil;
import com.summ.mnas.utils.TencentMapUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.omg.PortableInterceptor.ServerRequestInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.Collator;
import java.util.*;

/**
 * 门店增删改查
 * @author jygj_7500
 */
@Api(tags = "门店信息模块")
@RestController
@RequestMapping(value = "/shop",method = RequestMethod.POST)
public class ShopController extends AutoMapperController {

    @ResponseBody
    @RequestMapping("/all")
    public Object findAll(@RequestBody JShop jShop) {
        try {
            Map map = new HashMap();
            map.put("isDel",16);
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功 !", jShopMapper.selectByMap(map));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    /**
     * 根据地址的经纬度查看该地址与各门店的距离
     * @param map
     * @return
     */
    @ApiImplicitParam(name = "houseAddress",value = "房产详细地址")
    @ResponseBody
    @RequestMapping("/distance")
    public Object distance(@RequestBody Map<String,String> map) {
        try {
            Map<String, Double> tencentMap = TencentMapUtil.getLngAndLat("上海市" + map.get("houseAddress"));
            if (tencentMap == null) {
                return new ModelRes(ModelRes.Status.FAILED, "获取不到该地址，请重新输入 !");
            }
            List<JShop> shopList = jShopMapper.getAllShop();
            List<JShop> shopListRes = new ArrayList<JShop>();
            for (JShop jShop : shopList) {
                System.out.println("门店id>>>"+jShop.getShopId()+jShop.getShopName());
                String distance = TencentMapUtil.getDistance(tencentMap.get("lng"), tencentMap.get("lat"), jShop.getLongitude(), jShop.getLatitude());
                if (Double.valueOf(distance)<5){
                    jShop.setDistance(distance);
                    shopListRes.add(jShop);
                }
            }

            Collections.sort(shopListRes, new Comparator<JShop>() {
                @Override
                public int compare(JShop o1, JShop o2) {
                    Collator collator = Collator.getInstance();
                    return collator.compare(String.valueOf(o1.getDistance()), String.valueOf(o2.getDistance()));
                }
            });
            System.out.println("");
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功 !", ResponseUtil.List2Map(shopListRes));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }
}
