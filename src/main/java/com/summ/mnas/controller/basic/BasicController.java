package com.summ.mnas.controller.basic;

import com.summ.mnas.model.JArea;
import com.summ.mnas.model.JDictInfo;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.utils.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "基础模块")
@RestController
@RequestMapping(value = "/basic",method = RequestMethod.POST)
public class BasicController extends AutoMapperController {

    /**
     * 获取指定类型有哪些信息
     * @param jDictInfo
     * @return
     */
    @ApiOperation(value = "获取字典表信息")
    @ResponseBody
    @RequestMapping("/dict/find")
    public Object getDict(@RequestBody JDictInfo jDictInfo) {
        try {
            Map map = new HashMap();
            map.put("typeCode",jDictInfo.getTypecode());
            map.put("isDel",16);
            return new ModelRes(ModelRes.Status.SUCCESS, "", ResponseUtil.List2Map(jDictInfoMapper.selectByMap(map)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }
}
