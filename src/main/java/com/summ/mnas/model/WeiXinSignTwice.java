package com.summ.mnas.model;

public class WeiXinSignTwice {
    private String timeStamp;
    private String appId;
    private String nonceStr;
    private String package_value;
    private String signType;
    private String paySign;

    @Override
    public String toString() {
        return "WeiXinSignTwice{" +
                "timeStamp='" + timeStamp + '\'' +
                ", appId='" + appId + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                ", package_value='" + package_value + '\'' +
                ", signType='" + signType + '\'' +
                ", paySign='" + paySign + '\'' +
                '}';
    }

    public String getPackage_value() {
        return package_value;
    }

    public void setPackage_value(String package_value) {
        this.package_value = package_value;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }
}
