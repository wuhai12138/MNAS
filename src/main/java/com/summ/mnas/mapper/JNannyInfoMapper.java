package com.summ.mnas.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.summ.mnas.model.JNannyInfo;
import com.summ.mnas.model.request.NannyReq;
import com.summ.mnas.model.response.NannyInfoRes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author summ
 * @since 2018-05-21
 */
public interface JNannyInfoMapper extends BaseMapper<JNannyInfo> {

    NannyInfoRes getNannyInfoById(Integer nannyId);

    List<NannyInfoRes> getNannyList(@Param("nannyReq") NannyReq nannyReq);
    Integer getNannyListCount(@Param("nannyReq") NannyReq nannyReq);
}
