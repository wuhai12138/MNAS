package com.summ.mnas.controller.basic;


import com.baomidou.mybatisplus.mapper.Wrapper;
import com.summ.mnas.model.JCity;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.utils.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "市字典")
@RestController
@RequestMapping(value = "/basic/city", method = RequestMethod.POST)
public class CityController extends AutoMapperController {

    @ApiOperation(value = "获取市列表", notes = "根据provinceCode查询所有市列表")
    @ResponseBody
    @RequestMapping("/list")
    public Object findList(@RequestBody JCity jCity){
        try {
            return new ModelRes(ModelRes.Status.SUCCESS, "查询成功", ResponseUtil.List2Map(jCityMapper.selectList(new Wrapper<JCity>() {
                @Override
                public String getSqlSegment() {
                    return "where provinceCode like \"%"+jCity.getProvinceCode()+"%\"";
                }
            })));
        }catch (Exception e){
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }
}
