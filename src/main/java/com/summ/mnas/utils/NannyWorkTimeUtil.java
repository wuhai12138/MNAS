package com.summ.mnas.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/9/20.
 */
public class NannyWorkTimeUtil {

    public final static String[] dayType = new String[]{"mon_day", "tue_day", "wed_day", "thu_day", "fri_day", "sat_day", "sun_day"};
    public final static String[] nightType = new String[]{"mon_night", "tue_night", "wed_night", "thu_night", "fri_night", "sat_night", "sun_night"};
    public final static Long[] timeDic = new Long[]{1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L,
            16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L,
            4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L,};
    public final static String[] timeValue = new String[]{"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30",
            "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"};


    /**
     * 通过开始结束时间id获取时间值列表
     *
     * @param startId
     * @param endId
     * @return
     */
    public static List<Long> id2Value(int startId, int endId) {
        List<Long> listDay = new ArrayList<Long>();
        if (startId > endId) {
            return listDay;
        }
        for (int i = startId; i <= endId; i++) {
            listDay.add(timeDic[i-1]);
        }
        return listDay;
    }

    /**
     * 通过开始结束时间id获取时间字符串
     *
     * @return
     */
    public static String id2Time(int timeId) {
        if (timeId > 0 && timeId < 50) {
            return timeValue[timeId-1];
        }
        return "";
    }

    /**
     * 通过开始结束时间id获取时间字符串
     *
     * @return
     */
    public static Long getTimeListValue(int startId, int endId) {
        if (startId == 0 || endId == 0 || startId > endId) {
            return null;
        }
        Long l = 0L;
        for (int i = startId-1; i < endId; i++) {
            l += timeDic[i];
        }
        return l;
    }



    /**
     * 根据服务师工时值返回工时列表
     * @param timeValue
     * @return
     */

    public static String getNannyWorkTimeListByTimeValue(Long timeValue) {
        return "";
    }

}
