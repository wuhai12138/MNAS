package com.summ.mnas.controller.nanny;


import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.model.request.NannyReq;
import com.summ.mnas.utils.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "服务师基本信息模块")
@RestController
@RequestMapping(value = "/nanny", method = RequestMethod.POST)
public class NannyController extends AutoMapperController {


    @ApiOperation(value = "获取服务师列表", notes = "根据筛选条件获取列表")
    @ResponseBody
    @RequestMapping("/find")
    public Object findList(@RequestBody NannyReq nannyReq){
        nannyReq.setPage(nannyReq.getSize()*(nannyReq.getPage()-1));
        try {
            return new ModelRes(ModelRes.Status.SUCCESS, "查询成功", ResponseUtil.List2Map(jNannyInfoMapper.getNannyList(nannyReq),jNannyInfoMapper.getNannyListCount(nannyReq)));
        }catch (Exception e){
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

}
