package com.summ.mnas.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.summ.mnas.model.JAppBanner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author summ
 * @since 2018-06-22
 */
public interface JAppBannerMapper extends BaseMapper<JAppBanner> {

    List<JAppBanner> getBannerList(@Param("shopId") Integer shopId);
}
