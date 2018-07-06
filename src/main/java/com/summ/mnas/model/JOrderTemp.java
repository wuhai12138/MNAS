package com.summ.mnas.model;

import com.baomidou.mybatisplus.annotations.TableLogic;
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
@TableName("j_order_temp")
public class JOrderTemp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "orderId", type = IdType.AUTO)
    private Integer orderId;
    @TableField("customerId")
    private Integer customerId;
    @TableField("shopId")
    private Integer shopId;
    @TableField("houseId")
    private Integer houseId;
    /**
     * 订单状态
     */
    @TableField("orderStatus")
    private Integer orderStatus;
    /**
     * 订单关闭状态（默认未关闭）
     */
    @TableField("orderCloseStatus")
    private Integer orderCloseStatus;
    @TableField("goodsId")
    private Integer goodsId;
    /**
     * 订单日期
     */
    @TableField("orderDate")
    private Date orderDate;
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
    @TableField("teacherId")
    private Integer teacherId;
    /**
     * 单价
     */
    @TableField("unitPrice")
    private BigDecimal unitPrice;
    /**
     * 服务数量（平方米，个等等）
     */
    @TableField("serviceAmount")
    private Integer serviceAmount;
    /**
     * 总价
     */
    @TableField("totalPrice")
    private BigDecimal totalPrice;
    /**
     * 优惠金额
     */
    private BigDecimal discount;
    @TableField("couponListId")
    private Integer couponListId;
    /**
     * 实付金额
     */
    @TableField("payMoney")
    private BigDecimal payMoney;
    /**
     * 支付状态
     */
    @TableField("payStatus")
    private Integer payStatus;
    @TableField("payTime")
    private Date payTime;
    @TableField("createId")
    private Integer createId;
    @TableField("createTime")
    private Date createTime;
    @TableField("modifyId")
    private Integer modifyId;
    @TableField("modifyTime")
    private Date modifyTime;
    private String remark;
    @TableField("isDel")
    @TableLogic
    private Integer isDel;
    /**
     * 订单来源
     */
    private Integer orderOrigin;


    public Integer getOrderOrigin() {
        return orderOrigin;
    }

    public void setOrderOrigin(Integer orderOrigin) {
        this.orderOrigin = orderOrigin;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
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

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getServiceAmount() {
        return serviceAmount;
    }

    public void setServiceAmount(Integer serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Integer getCouponListId() {
        return couponListId;
    }

    public void setCouponListId(Integer couponListId) {
        this.couponListId = couponListId;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    @Override
    public String toString() {
        return "JOrderTemp{" +
        "orderId=" + orderId +
        ", customerId=" + customerId +
        ", shopId=" + shopId +
        ", houseId=" + houseId +
        ", orderStatus=" + orderStatus +
        ", orderCloseStatus=" + orderCloseStatus +
        ", goodsId=" + goodsId +
        ", orderDate=" + orderDate +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", startTimeValue=" + startTimeValue +
        ", endTimeValue=" + endTimeValue +
        ", teacherId=" + teacherId +
        ", unitPrice=" + unitPrice +
        ", serviceAmount=" + serviceAmount +
        ", totalPrice=" + totalPrice +
        ", discount=" + discount +
        ", couponListId=" + couponListId +
        ", payMoney=" + payMoney +
        ", payStatus=" + payStatus +
        ", payTime=" + payTime +
        ", createId=" + createId +
        ", createTime=" + createTime +
        ", modifyId=" + modifyId +
        ", modifyTime=" + modifyTime +
        ", remark=" + remark +
        ", isDel=" + isDel +
        "}";
    }
}
