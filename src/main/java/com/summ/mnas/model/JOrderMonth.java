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
 * @since 2018-05-29
 */
@TableName("j_order_month")
public class JOrderMonth implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "orderId", type = IdType.AUTO)
    private Integer orderId;
    @TableField("customerId")
    private Integer customerId;
    @TableField("shopId")
    private Integer shopId;
    @TableField("houseId")
    private Integer houseId;
    @TableField("serviceId")
    private Integer serviceId;
    /**
     * 默认预约中
     */
    @TableField("orderStatus")
    private Integer orderStatus;
    /**
     * 订单关闭状态（默认未关闭）
     */
    @TableField("orderCloseStatus")
    private Integer orderCloseStatus;
    @TableField("startDate")
    private Date startDate;
    /**月份*/
    private Integer month;
    @TableField("endDate")
    private Date endDate;
    /**
     * 客户每日单价
     */
    @TableField("customerUnitPrice")
    private BigDecimal customerUnitPrice;
    /**
     * 服务师每日工资
     */
    @TableField("nannyUnitPrice")
    private BigDecimal nannyUnitPrice;
    /**
     * 包年服务费支付状态
     */
    @TableField("payStatus")
    private Integer payStatus;
    @TableField("goodsId")
    private Integer goodsId;
    @TableField("supplierId")
    private Integer supplierId;
    @TableField("teacherId")
    private Integer teacherId;
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

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
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

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
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

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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
        return "JOrderMonth{" +
        "orderId=" + orderId +
        ", customerId=" + customerId +
        ", shopId=" + shopId +
        ", houseId=" + houseId +
        ", serviceId=" + serviceId +
        ", orderStatus=" + orderStatus +
        ", orderCloseStatus=" + orderCloseStatus +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", customerUnitPrice=" + customerUnitPrice +
        ", nannyUnitPrice=" + nannyUnitPrice +
        ", payStatus=" + payStatus +
        ", goodsId=" + goodsId +
        ", supplierId=" + supplierId +
        ", teacherId=" + teacherId +
        ", createId=" + createId +
        ", createTime=" + createTime +
        ", modifyId=" + modifyId +
        ", modifyTime=" + modifyTime +
        ", remark=" + remark +
        ", isDel=" + isDel +
        "}";
    }
}
