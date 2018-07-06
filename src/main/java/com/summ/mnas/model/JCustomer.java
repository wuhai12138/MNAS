package com.summ.mnas.model;

import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author summ
 * @since 2018-05-14
 */
@TableName("j_customer")
public class JCustomer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "customerId", type = IdType.AUTO)
    private Integer customerId;
    @TableField("customerName")
    private String customerName;
    @TableField("customerPhone")
    private String customerPhone;
    /**
     * 用户类型11注册12会员13僵尸用户
     */
    @TableField("customerType")
    private Integer customerType;
    /**
     * 1男2女
     */
    @TableField("customerSex")
    private Integer customerSex;
    @TableField("customerBalance")
    private BigDecimal customerBalance;
    /**
     * 14警告15不警告
     */
    @TableField("warnType")
    private Integer warnType;
    /**
     * 1门店2电话咨询3ios4android
     */
    @TableField("memberOrigin")
    private Integer memberOrigin;
    @TableField("memberLevel")
    private Integer memberLevel;
    @TableField("memberType")
    private Integer memberType;
    /**
     * 微信小程序openId
     */
    @TableField("WeiXinOpenId")
    private String WeiXinOpenId;
    /**
     * 支付宝小程序openId
     */
    @TableField("AlyOpenId")
    private String AlyOpenId;
    @TableField("modifyId")
    private Integer modifyId;
    @TableField("modifyTime")
    private Date modifyTime;
    @TableField("createId")
    private Integer createId;
    @TableField("createTime")
    private Date createTime;
    private String remark;
    /**
     * 是否删除（1为已删除）
     */
    @TableField("isDel")
    @TableLogic
    private Integer isDel;
    /**积分*/
    private Integer customerCredit;

    @TableField(exist = false)
    private List<JCustomerHouse> customerHouseList;


    public Integer getCustomerCredit() {
        return customerCredit;
    }

    public void setCustomerCredit(Integer customerCredit) {
        this.customerCredit = customerCredit;
    }

    public List<JCustomerHouse> getCustomerHouseList() {
        return customerHouseList;
    }

    public void setCustomerHouseList(List<JCustomerHouse> customerHouseList) {
        this.customerHouseList = customerHouseList;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public Integer getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(Integer customerSex) {
        this.customerSex = customerSex;
    }

    public BigDecimal getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(BigDecimal customerBalance) {
        this.customerBalance = customerBalance;
    }

    public Integer getWarnType() {
        return warnType;
    }

    public void setWarnType(Integer warnType) {
        this.warnType = warnType;
    }

    public Integer getMemberOrigin() {
        return memberOrigin;
    }

    public void setMemberOrigin(Integer memberOrigin) {
        this.memberOrigin = memberOrigin;
    }

    public Integer getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    public String getWeiXinOpenId() {
        return WeiXinOpenId;
    }

    public void setWeiXinOpenId(String WeiXinOpenId) {
        this.WeiXinOpenId = WeiXinOpenId;
    }

    public String getAlyOpenId() {
        return AlyOpenId;
    }

    public void setAlyOpenId(String AlyOpenId) {
        this.AlyOpenId = AlyOpenId;
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
        return "JCustomer{" +
        "customerId=" + customerId +
        ", customerName=" + customerName +
        ", customerPhone=" + customerPhone +
        ", customerType=" + customerType +
        ", customerSex=" + customerSex +
        ", customerBalance=" + customerBalance +
        ", warnType=" + warnType +
        ", memberOrigin=" + memberOrigin +
        ", memberLevel=" + memberLevel +
        ", memberType=" + memberType +
        ", WeiXinOpenId=" + WeiXinOpenId +
        ", AlyOpenId=" + AlyOpenId +
        ", modifyId=" + modifyId +
        ", modifyTime=" + modifyTime +
        ", createId=" + createId +
        ", createTime=" + createTime +
        ", remark=" + remark +
        ", isDel=" + isDel +
        "}";
    }
}
