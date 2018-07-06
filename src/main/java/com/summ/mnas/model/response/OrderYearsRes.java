package com.summ.mnas.model.response;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by jygj_7500 on 18/1/15.
 */
public class OrderYearsRes {
    private Integer orderId;

    /**  */
    private Integer customerId;

    /**  */
    private Integer shopId;

    /**  */
    private Integer houseId;

    /**  */
    private Integer serviceId;

    /**  */
    private Integer orderStatus;

    private Integer month;

    /** 订单关闭状态（默认未关闭） */
    private Integer orderCloseStatus;

    /**  */
    private Date startDate;

    /**  */
    private Date endDate;

    /** 服务师工资，用于计算服务费和中介费 */
    private BigDecimal salary;

    /** 客户服务费 */
    private BigDecimal serviceFees;

    /** 包年服务费支付状态 */
    private Integer payStatus;

    private BigDecimal agencyFees;

    /**  */
    private Integer goodsId;

    /**  */
    private Integer supplierId;

    /**  */
    private Integer teacherId;

    /**  */
    private Integer createId;

    /**  */
    private Date createTime;

    /**  */
    private Integer modifyId;

    /**  */
    private Date modifyTime;

    /**  */
    private String remark;

    /**  */
    private Integer isDel;

    private String customerName;

    private String customerPhone;
    private BigDecimal customerBalance;
    private String houseAddress;
    private String orderStatusInfo;
    private String orderCloseStatusInfo;
    private String payStatusInfo;
    private BigDecimal nannyAgencyFees;
    private String service;
    private String needString;
    private String serviceDetail;
    private String shopName;

    public BigDecimal getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(BigDecimal customerBalance) {
        this.customerBalance = customerBalance;
    }

    public String getServiceDetail() {
        return serviceDetail;
    }

    public void setServiceDetail(String serviceDetail) {
        this.serviceDetail = serviceDetail;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getAgencyFees() {
        return agencyFees;
    }

    public void setAgencyFees(BigDecimal agencyFees) {
        this.agencyFees = agencyFees;
    }

    public BigDecimal getServiceFees() {
        return serviceFees;
    }

    public void setServiceFees(BigDecimal serviceFees) {
        this.serviceFees = serviceFees;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayStatusInfo() {
        return payStatusInfo;
    }

    public void setPayStatusInfo(String payStatusInfo) {
        this.payStatusInfo = payStatusInfo;
    }

    public BigDecimal getNannyAgencyFees() {
        return nannyAgencyFees;
    }

    public void setNannyAgencyFees(BigDecimal nannyAgencyFees) {
        this.nannyAgencyFees = nannyAgencyFees;
    }

    public Integer getOrderCloseStatus() {
        return orderCloseStatus;
    }

    public void setOrderCloseStatus(Integer orderCloseStatus) {
        this.orderCloseStatus = orderCloseStatus;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getModifyId() {
        return modifyId;
    }

    public void setModifyId(Integer modifyId) {
        this.modifyId = modifyId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getOrderCloseStatusInfo() {
        return orderCloseStatusInfo;
    }

    public void setOrderCloseStatusInfo(String orderCloseStatusInfo) {
        this.orderCloseStatusInfo = orderCloseStatusInfo;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getOrderStatusInfo() {
        return orderStatusInfo;
    }

    public void setOrderStatusInfo(String orderStatusInfo) {
        this.orderStatusInfo = orderStatusInfo;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getNeedString() {
        return needString;
    }

    public void setNeedString(String needString) {
        this.needString = needString;
    }
}
