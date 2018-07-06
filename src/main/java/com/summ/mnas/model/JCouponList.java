package com.summ.mnas.model;

import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("j_coupon_list")
public class JCouponList implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "couponListId", type = IdType.AUTO)
    private Integer couponListId;
    @TableField("couponCode")
    private String couponCode;
    @TableField("couponId")
    private Integer couponId;
    @TableField("shopId")
    private Integer shopId;
    @TableField("customerId")
    private Integer customerId;
    @TableField("couponStatus")
    private Integer couponStatus;
    @TableField("orderId")
    private Integer orderId;
    @TableField("createTime")
    private Date createTime;
    @TableField("useTime")
    private Date useTime;
    @TableField("isDel")
    @TableLogic
    private Integer isDel;
    private String remark;


    public Integer getCouponListId() {
        return couponListId;
    }

    public void setCouponListId(Integer couponListId) {
        this.couponListId = couponListId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "JCouponList{" +
        "couponListId=" + couponListId +
        ", couponCode=" + couponCode +
        ", couponId=" + couponId +
        ", shopId=" + shopId +
        ", customerId=" + customerId +
        ", couponStatus=" + couponStatus +
        ", orderId=" + orderId +
        ", createTime=" + createTime +
        ", useTime=" + useTime +
        ", isDel=" + isDel +
        ", remark=" + remark +
        "}";
    }
}
