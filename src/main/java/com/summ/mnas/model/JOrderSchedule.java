package com.summ.mnas.model;

import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author summ
 * @since 2018-05-15
 */
@TableName("j_order_schedule")
public class JOrderSchedule implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "scheduleId", type = IdType.AUTO)
    private Integer scheduleId;
    @TableField("customerId")
    private Integer customerId;
    @TableField("orderId")
    private Integer orderId;
    @TableField("orderType")
    private Integer orderType;
    /**
     * 对账单
     */
    @TableField("statmentId")
    private Integer statmentId;
    @TableField("scheduleDate")
    private Date scheduleDate;
    /**
     * 单价
     */
    @TableField("unitPrice")
    private BigDecimal unitPrice;
    /**
     * 总价
     */
    @TableField("totalPrice")
    private BigDecimal totalPrice;
    /**
     * 成本（取决于服务师）
     */
    private BigDecimal cost;
    @TableField("scheduleType")
    private Integer scheduleType;
    /**
     * 日程状态
     */
    @TableField("scheduleStatus")
    private Integer scheduleStatus;
    /**
     * 支付状态
     */
    @TableField("payStatus")
    private Integer payStatus;
    /**
     * 开始时间Id
     */
    @TableField("startTime")
    private Integer startTime;
    /**
     * 结束时间Id
     */
    @TableField("endTime")
    private Integer endTime;
    @TableField("startTimeValue")
    private String startTimeValue;
    @TableField("endTimeValue")
    private String endTimeValue;
    @TableField("timeValue")
    private Long timeValue;
    /**
     * 签到人id
     */
    @TableField("clockId")
    private Integer clockId;
    /**
     * 签到时间
     */
    @TableField("clockTime")
    private Date clockTime;
    @TableField("clockLatitude")
    private Double clockLatitude;
    @TableField("clockLongitude")
    private Double clockLongitude;
    /**
     * 完工操作人id
     */
    @TableField("completedId")
    private Integer completedId;
    /**
     * 完工时间
     */
    @TableField("completedTime")
    private Date completedTime;
    /**
     * 暂停时间
     */
    @TableField("suspendTime")
    private Date suspendTime;
    /**
     * 取消操作人id
     */
    @TableField("cancelId")
    private Integer cancelId;
    /**
     * 取消时间 
     */
    @TableField("cancelTime")
    private Date cancelTime;
    /**
     * 星期
     */
    private String weekday;
    private String remark;
    @TableField("shopId")
    private Integer shopId;
    @TableField("houseId")
    private Integer houseId;
    @TableField("serviceId")
    private Integer serviceId;
    @TableField("goodsId")
    private Integer goodsId;


    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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

    public Integer getStatmentId() {
        return statmentId;
    }

    public void setStatmentId(Integer statmentId) {
        this.statmentId = statmentId;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
    }

    public Integer getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(Integer scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getStartTimeValue() {
        return startTimeValue;
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

    public Long getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(Long timeValue) {
        this.timeValue = timeValue;
    }

    public Integer getClockId() {
        return clockId;
    }

    public void setClockId(Integer clockId) {
        this.clockId = clockId;
    }

    public Date getClockTime() {
        return clockTime;
    }

    public void setClockTime(Date clockTime) {
        this.clockTime = clockTime;
    }

    public Double getClockLatitude() {
        return clockLatitude;
    }

    public void setClockLatitude(Double clockLatitude) {
        this.clockLatitude = clockLatitude;
    }

    public Double getClockLongitude() {
        return clockLongitude;
    }

    public void setClockLongitude(Double clockLongitude) {
        this.clockLongitude = clockLongitude;
    }

    public Integer getCompletedId() {
        return completedId;
    }

    public void setCompletedId(Integer completedId) {
        this.completedId = completedId;
    }

    public Date getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(Date completedTime) {
        this.completedTime = completedTime;
    }

    public Date getSuspendTime() {
        return suspendTime;
    }

    public void setSuspendTime(Date suspendTime) {
        this.suspendTime = suspendTime;
    }

    public Integer getCancelId() {
        return cancelId;
    }

    public void setCancelId(Integer cancelId) {
        this.cancelId = cancelId;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public String toString() {
        return "JOrderSchedule{" +
        "scheduleId=" + scheduleId +
        ", customerId=" + customerId +
        ", orderId=" + orderId +
        ", orderType=" + orderType +
        ", statmentId=" + statmentId +
        ", scheduleDate=" + scheduleDate +
        ", unitPrice=" + unitPrice +
        ", totalPrice=" + totalPrice +
        ", cost=" + cost +
        ", scheduleType=" + scheduleType +
        ", scheduleStatus=" + scheduleStatus +
        ", payStatus=" + payStatus +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", startTimeValue=" + startTimeValue +
        ", endTimeValue=" + endTimeValue +
        ", timeValue=" + timeValue +
        ", clockId=" + clockId +
        ", clockTime=" + clockTime +
        ", clockLatitude=" + clockLatitude +
        ", clockLongitude=" + clockLongitude +
        ", completedId=" + completedId +
        ", completedTime=" + completedTime +
        ", suspendTime=" + suspendTime +
        ", cancelId=" + cancelId +
        ", cancelTime=" + cancelTime +
        ", weekday=" + weekday +
        ", remark=" + remark +
        ", shopId=" + shopId +
        ", houseId=" + houseId +
        ", serviceId=" + serviceId +
        ", goodsId=" + goodsId +
        "}";
    }
}
