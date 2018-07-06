package com.summ.mnas.model.response;

public class DecodeObj {

    /**
     * phoneNumber : 15267478463
     * purePhoneNumber : 15267478463
     * countryCode : 86
     * watermark : {"timestamp":1527678866,"appid":"wx358c6d6d5adb0f0f"}
     */

    private String phoneNumber;
    private String purePhoneNumber;
    private String countryCode;
    private WatermarkBean watermark;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPurePhoneNumber() {
        return purePhoneNumber;
    }

    public void setPurePhoneNumber(String purePhoneNumber) {
        this.purePhoneNumber = purePhoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public WatermarkBean getWatermark() {
        return watermark;
    }

    public void setWatermark(WatermarkBean watermark) {
        this.watermark = watermark;
    }

    public static class WatermarkBean {
        /**
         * timestamp : 1527678866
         * appid : wx358c6d6d5adb0f0f
         */

        private int timestamp;
        private String appid;

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }
    }
}
