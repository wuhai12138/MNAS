package com.summ.mnas.model;

import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author summ
 * @since 2018-05-15
 */
@TableName("j_order_refund")
public class JOrderRefund implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单退款表
     */
    @TableId(value = "refundId", type = IdType.AUTO)
    private Integer refundId;
    @TableField("customerId")
    private Integer customerId;
    @TableField("orderType")
    private Integer orderType;
    @TableField("orderId")
    private Integer orderId;
    @TableField("scheduleId")
    private Integer scheduleId;
    /**
     * 支付方式
     */
    @TableField("payWay")
    @ApiModelProperty(value = "支付方式")
    private Integer payWay;
    /**
     * 退款方式
     */
    @ApiModelProperty(value = "退款方式")
    @TableField("refundWay")
    private Integer refundWay;
    /**
     * 审核状态
     */
    @TableField("checkStatus")
    @ApiModelProperty(value = "审核状态")
    private Integer checkStatus;
    /**
     * 退款原因
     */
    @ApiModelProperty(value = "退款原因")
    private Integer reason;
    /**
     * 订单金额
     */
    @TableField("orderMoney")
    @ApiModelProperty(value = "订单金额")
    private BigDecimal orderMoney;
    /**
     * 折扣金额
     */
    @ApiModelProperty(value = "折扣金额")
    private BigDecimal discount;
    /**
     * 支付金额
     */
    @ApiModelProperty(value = "支付金额")
    @TableField("payMoney")
    private BigDecimal payMoney;
    /**
     * 退款金额
     */
    @ApiModelProperty(value = "退款金额")
    @TableField("refundMoney")
    private BigDecimal refundMoney;
    /**
     * 优惠券id
     */
    @ApiModelProperty(value = "优惠券id")
    @TableField("couponListId")
    private Integer couponListId;
    private String remark;
    @TableField("createId")
    private Integer createId;
    @TableField("createDate")
    private Date createDate;
    @TableField("checkId")
    private Integer checkId;
    @TableField("checkDate")
    private Date checkDate;
    @TableField("isDel")
    @TableLogic
    private Integer isDel;


    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getPayWay() {
        return payWay;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    public Integer getRefundWay() {
        return refundWay;
    }

    public void setRefundWay(Integer refundWay) {
        this.refundWay = refundWay;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public BigDecimal getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(BigDecimal refundMoney) {
        this.refundMoney = refundMoney;
    }

    public Integer getCouponListId() {
        return couponListId;
    }

    public void setCouponListId(Integer couponListId) {
        this.couponListId = couponListId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "JOrderRefund{" +
        "refundId=" + refundId +
        ", customerId=" + customerId +
        ", orderType=" + orderType +
        ", orderId=" + orderId +
        ", scheduleId=" + scheduleId +
        ", payWay=" + payWay +
        ", refundWay=" + refundWay +
        ", checkStatus=" + checkStatus +
        ", reason=" + reason +
        ", orderMoney=" + orderMoney +
        ", discount=" + discount +
        ", payMoney=" + payMoney +
        ", refundMoney=" + refundMoney +
        ", couponListId=" + couponListId +
        ", remark=" + remark +
        ", createId=" + createId +
        ", createDate=" + createDate +
        ", checkId=" + checkId +
        ", checkDate=" + checkDate +
        ", isDel=" + isDel +
        "}";
    }
}
