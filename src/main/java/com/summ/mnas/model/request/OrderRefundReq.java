package com.summ.mnas.model.request;

import io.swagger.annotations.ApiModelProperty;

public class OrderRefundReq {
    private Integer customerId;
    @ApiModelProperty(value = "审核状态")
    private Integer checkStatus;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }
}
