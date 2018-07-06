package com.summ.mnas.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.summ.mnas.model.JShop;
import com.summ.mnas.model.request.ShopReq;
import com.summ.mnas.model.response.ShopRes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * JShop 表数据库控制层接口
 *
 */
public interface JShopMapper extends BaseMapper<JShop> {

    List<JShop> getAllShop();

    List<ShopRes> getShopList(@Param("shopReq") ShopReq shopReq);
}