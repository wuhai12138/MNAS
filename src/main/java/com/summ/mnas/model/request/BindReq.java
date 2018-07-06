package com.summ.mnas.model.request;

public class BindReq {
    private String customerPhone;
    private Integer customerId;
    private String WeiXinOpenId;
    private String authCode;

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getWeiXinOpenId() {
        return WeiXinOpenId;
    }

    public void setWeiXinOpenId(String weiXinOpenId) {
        WeiXinOpenId = weiXinOpenId;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
}
