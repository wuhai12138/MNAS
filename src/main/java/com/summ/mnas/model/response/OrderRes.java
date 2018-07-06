package com.summ.mnas.model.response;

import com.baomidou.mybatisplus.annotations.TableField;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by jygj_7500 on 18/1/15.
 */
public class OrderRes {
    private Integer orderId;

    private Integer orderType;

    private Integer payStatus;
    private String payStatusInfo;

    /**  */
    private Integer customerId;

    /**  */
    private Integer orderStatus;

    /** 订单关闭状态（默认未关闭） */
    private Integer orderCloseStatus;

    /** 服务数量（平方米，个等等） */
    private Integer serviceAmount;

    /**  */
    private Integer goodsId;

    private Integer shopId;

    @TableField("startTimeValue")
    private String startTimeValue;
    @TableField("endTimeValue")
    private String endTimeValue;
    @TableField("totalPrice")
    private BigDecimal totalPrice;

    /**  */
    private Date createTime;
    private Date orderDate;

    private String houseAddress;
    private String orderStatusInfo;
    private String orderCloseStatusInfo;

    private String service;
    @ApiModelProperty(value = "临时服务单位")
    private String unitName;
    @ApiModelProperty(value = "最低限制")
    private Integer lowest;
    private String serviceDetail;

    @ApiModelProperty(value = "包月订单开始日期")
    private Date startDate;
    @ApiModelProperty(value = "包月订单结束日期")
    private Date endDate;
    @ApiModelProperty(value = "客户每日单价")
    private BigDecimal customerUnitPrice;
    @ApiModelProperty(value = "服务师每日工资")
    private BigDecimal nannyUnitPrice;
    /**
     * 优惠金额
     */
    @ApiModelProperty(value = "临时订单优惠金额")
    private BigDecimal discount;

    @ApiModelProperty(value = "包年订单服务师月工资")
    private BigDecimal salary;
    @ApiModelProperty(value = "包年订单客户服务费")
    private BigDecimal serviceFees;

    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getLowest() {
        return lowest;
    }

    public void setLowest(Integer lowest) {
        this.lowest = lowest;
    }

    public Date getStartDate() {
        return startDate;
    }

    public BigDecimal getCustomerUnitPrice() {
        return customerUnitPrice;
    }

    public void setCustomerUnitPrice(BigDecimal customerUnitPrice) {
        this.customerUnitPrice = customerUnitPrice;
    }

    public BigDecimal getNannyUnitPrice() {
        return nannyUnitPrice;
    }

    public void setNannyUnitPrice(BigDecimal nannyUnitPrice) {
        this.nannyUnitPrice = nannyUnitPrice;
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

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getServiceFees() {
        return serviceFees;
    }

    public void setServiceFees(BigDecimal serviceFees) {
        this.serviceFees = serviceFees;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
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

    public String getStartTimeValue() {
        return startTimeValue;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setStartTimeValue(String startTimeValue) {
        this.startTimeValue = startTimeValue;
    }

    public String getEndTimeValue() {
        return endTimeValue;
    }

    public void setEndTimeValue(String endTimeValue) {
        this.endTimeValue = endTimeValue;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getServiceAmount() {
        return serviceAmount;
    }

    public void setServiceAmount(Integer serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderCloseStatus() {
        return orderCloseStatus;
    }

    public void setOrderCloseStatus(Integer orderCloseStatus) {
        this.orderCloseStatus = orderCloseStatus;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getOrderCloseStatusInfo() {
        return orderCloseStatusInfo;
    }

    public void setOrderCloseStatusInfo(String orderCloseStatusInfo) {
        this.orderCloseStatusInfo = orderCloseStatusInfo;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getServiceDetail() {
        return serviceDetail;
    }

    public void setServiceDetail(String serviceDetail) {
        this.serviceDetail = serviceDetail;
    }
}
