package com.summ.mnas.utils;


import com.summ.mnas.Consts;
import com.summ.mnas.model.others.TencentMapDistanceRes;
import com.summ.mnas.model.others.TencentMapRes;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class TencentMapUtil {

    public static Map getLngAndLat(String address) throws IOException {
        Map map = new HashMap();
        String url = "http://apis.map.qq.com/ws/geocoder/v1/?key=" + Consts.key + "&address=" + address;
        TencentMapRes tencentMapRes = JsonUtil.json2Bean(RequestUtil.doGet(url), TencentMapRes.class);
        if (tencentMapRes.getStatus() == 0) {
            map.put("lng", tencentMapRes.getResult().getLocation().getLng());
            map.put("lat", tencentMapRes.getResult().getLocation().getLat());
            return map;
        } else {
            return null;
        }

    }

    public static String getDistance(double lng1,double lat1,double lng2,double lat2) throws IOException, InterruptedException {

        String url="http://apis.map.qq.com/ws/distance/v1/?mode=driving&from="+lat1+","+lng1+"&to="+lat2+","+lng2+"&key="+Consts.key;
        System.out.println("url>>>:"+url);
        TencentMapDistanceRes tencentMapDistanceRes = JsonUtil.json2Bean(RequestUtil.doGet(url),TencentMapDistanceRes.class);
        if (tencentMapDistanceRes.getStatus()==120){
            //毫秒
            Thread.sleep(1000);
            tencentMapDistanceRes = JsonUtil.json2Bean(RequestUtil.doGet(url),TencentMapDistanceRes.class);
            if (tencentMapDistanceRes.getStatus()==373 && tencentMapDistanceRes.getMessage().equals("起终点距离超长")){
                return "10";
            }
        }
        if (tencentMapDistanceRes.getStatus()==373 && tencentMapDistanceRes.getMessage().equals("起终点距离超长")){
            return "10";
        }
        System.out.println("tencentMapDistanceRes>>"+JsonUtil.toJson(tencentMapDistanceRes));
        BigDecimal b1 = new BigDecimal(tencentMapDistanceRes.getResult().getElements().get(0).getDistance());
        System.out.println("两个地点距离:"+b1 + "米");
        return b1.divide(new BigDecimal(1000),2,BigDecimal.ROUND_HALF_UP).toString();
    }

}
