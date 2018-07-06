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
@TableName("j_coupon")
public class JCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "couponId", type = IdType.AUTO)
    private Integer couponId;
    @TableField("couponName")
    private String couponName;
    @TableField("couponDetail")
    private String couponDetail;
    @TableField("couponPrice")
    private BigDecimal couponPrice;
    @TableField("couponCost")
    private BigDecimal couponCost;
    /**
     * 订单最低金额
     */
    @TableField("orderMiniPrice")
    private BigDecimal orderMiniPrice;
    /**
     * 表示上下架(16上架，17下架)
     */
    @TableField("isDel")
    @TableLogic
    private Integer isDel;
    @TableField("createTime")
    private Date createTime;
    @TableField("validTime")
    private Date validTime;
    @TableField("couponOrigin")
    private Integer couponOrigin;


    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponDetail() {
        return couponDetail;
    }

    public void setCouponDetail(String couponDetail) {
        this.couponDetail = couponDetail;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public BigDecimal getCouponCost() {
        return couponCost;
    }

    public void setCouponCost(BigDecimal couponCost) {
        this.couponCost = couponCost;
    }

    public BigDecimal getOrderMiniPrice() {
        return orderMiniPrice;
    }

    public void setOrderMiniPrice(BigDecimal orderMiniPrice) {
        this.orderMiniPrice = orderMiniPrice;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getValidTime() {
        return validTime;
    }

    public void setValidTime(Date validTime) {
        this.validTime = validTime;
    }

    public Integer getCouponOrigin() {
        return couponOrigin;
    }

    public void setCouponOrigin(Integer couponOrigin) {
        this.couponOrigin = couponOrigin;
    }

    @Override
    public String toString() {
        return "JCoupon{" +
        "couponId=" + couponId +
        ", couponName=" + couponName +
        ", couponDetail=" + couponDetail +
        ", couponPrice=" + couponPrice +
        ", couponCost=" + couponCost +
        ", orderMiniPrice=" + orderMiniPrice +
        ", isDel=" + isDel +
        ", createTime=" + createTime +
        ", validTime=" + validTime +
        ", couponOrigin=" + couponOrigin +
        "}";
    }
}
