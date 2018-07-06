package com.summ.mnas.model.request;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

public class CustomerRechargeReq {
    private String money;
    private Integer customerId;
    @ApiModelProperty(value = "手机终端")
    private Integer terminal;

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
