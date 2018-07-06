package com.summ.mnas.utils;


/**
 * Created by jygj_7500 on 18/1/2.
 */
public class OrderUtil {
    public static String generateStamentNumber(Integer customerId) {
        System.out.println("对账单流水号>>>>" + String.valueOf(System.currentTimeMillis()  + (int)(Math.random() * 10000)));

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf(System.currentTimeMillis()));
        stringBuffer.append(StringUtil.changeIntegerLenght(customerId,5));
        stringBuffer.append((int)(Math.random() * 10000));
        return stringBuffer.toString();
    }
}
