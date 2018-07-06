package com.summ.mnas.controller.banner;


import com.summ.mnas.Consts;
import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.JAppBanner;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.utils.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(tags = "首页活动轮播图模块")
@RestController
@RequestMapping(value = "/banner", method = RequestMethod.POST)
public class AppBannerController extends AutoMapperController {

    @ApiOperation(value = "根据客户地址查找轮播图列表",notes = "请求字段 shopId")
    @ResponseBody
    @RequestMapping("/find")
    public Object find(@RequestBody Map aa) {
        try {
            Integer shopId = (Integer) aa.get("shopId");
            List<JAppBanner> jAppBannerList = jAppBannerMapper.getBannerList(shopId);
            for (JAppBanner jAppBanner : jAppBannerList) {
                jAppBanner.setPhoto(Consts.appBannerUrlRes + jAppBanner.getPhoto());
            }
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功 ! ", ResponseUtil.List2Map(jAppBannerList));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err ! ");
        }
    }
}
