package com.summ.mnas.controller.goods;


import com.baomidou.mybatisplus.mapper.Wrapper;
import com.summ.mnas.Consts;
import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.JGoodsContract;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.utils.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 产品管理
 * @author jygj_7500
 */
@Api(tags = "产品模块")
@RestController
@RequestMapping(value = "/goods",method = RequestMethod.POST)
public class GoodsController extends AutoMapperController {


    @ApiOperation(value = "查询某个产品详情")
    @ResponseBody
    @RequestMapping("/find")
    public Object find(@RequestBody JGoodsContract map) {
        try {
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功 !", jGoodsContractMapper.selectById(map.getGoodsId()));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }


//    @ApiOperation(value = "查询某种产品类型的列表 参数:goodsType产品类型 areaId区域id")
//    @ResponseBody
//    @RequestMapping("/list")
//    public Object findList(@RequestBody Map<String,Integer> map) {
//        try {
//            List<JGoodsContract> jGoodsContractList = jGoodsContractMapper.getGoodsList(map.get("goodsType"),map.get("areaId"));
//            for (JGoodsContract jGoodsContract:jGoodsContractList){
//                jGoodsContract.setBanner(Consts.goodsBannerUrlRes+jGoodsContract.getBanner());
//            }
//            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功 !", ResponseUtil.List2Map(jGoodsContractList));
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ModelRes(ModelRes.Status.ERROR, "server err !");
//        }
//    }

    @ApiOperation(value = "查询某种产品类型的列表 参数:goodsType产品类型 shopId区域id")
    @ResponseBody
    @RequestMapping("/list")
    public Object findList(@RequestBody Map<String,Integer> map) {
        try {
            List<JGoodsContract> jGoodsContractList = jGoodsContractMapper.getGoodsList(map.get("goodsType"),map.get("shopId"));
            for (JGoodsContract jGoodsContract:jGoodsContractList){
                jGoodsContract.setBanner(Consts.goodsBannerUrlRes+jGoodsContract.getBanner());
            }
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功 !", ResponseUtil.List2Map(jGoodsContractList));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }



}
