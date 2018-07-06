package com.summ.mnas.mapper;

import com.summ.mnas.model.JGoodsContract;
import com.baomidou.mybatisplus.mapper.BaseMapper;
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
public interface JGoodsContractMapper extends BaseMapper<JGoodsContract> {

    List<JGoodsContract> getGoodsList(@Param("goodsType") Integer goodsType, @Param("shopId") Integer shopId);
}
