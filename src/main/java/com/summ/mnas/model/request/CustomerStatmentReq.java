package com.summ.mnas.model.request;

import java.util.Date;

/**
 * Created by jygj_7500 on 17/11/29.
 */
public class CustomerStatmentReq {
    private Integer customerId;
    private Date startDate;
    private Date endDate;
    private Integer chargeWay;
    private Integer statmentCustomerType;
    private Integer page;
    private Integer size;

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setStatmentCustomerType(Integer statmentCustomerType) {
        this.statmentCustomerType = statmentCustomerType;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getChargeWay() {
        return chargeWay;
    }

    public void setChargeWay(Integer chargeWay) {
        this.chargeWay = chargeWay;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getStatmentCustomerType() {
        return statmentCustomerType;
    }

    public void setStatmentCustomerType(int statmentCustomerType) {
        this.statmentCustomerType = statmentCustomerType;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
