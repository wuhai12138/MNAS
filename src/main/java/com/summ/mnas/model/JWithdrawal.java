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
@TableName("j_withdrwal")
public class JWithdrawal implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 提现表
     */
    @TableId(value = "withdrawalId", type = IdType.AUTO)
    private Integer withdrawalId;
    @TableField("provinceId")
    private Integer provinceId;
    @TableField("cityId")
    private Integer cityId;
    @TableField("areaId")
    private Integer areaId;
    @TableField("streetId")
    private Integer streetId;
    @TableField("withdrawalCard")
    private String withdrawalCard;
    @TableField("withdrawalIdAddress")
    private String withdrawalIdAddress;
    /**
     * 申请人类别
     */
    @ApiModelProperty(value = "申请人类别")
    @TableField("applyType")
    private Integer applyType;
    /**
     * 申请人编号
     */
    @ApiModelProperty(value = "申请人编号")
    @TableField("applyId")
    private Integer applyId;
    @TableField("applyName")
    private String applyName;
    private BigDecimal money;
    @TableField("applyPhone")
    private String applyPhone;
    @TableField("applyDate")
    private Date applyDate;
    @TableField("checkId")
    private Integer checkId;
    @TableField("checkDate")
    private Date checkDate;
    @TableField("checkStatus")
    private Integer checkStatus;
    @TableField("payId")
    private Integer payId;
    @TableField("payDate")
    private Date payDate;
    private String remark;
    @TableField("isDel")
    @TableLogic
    private Integer isDel;


    public Integer getWithdrawalId() {
        return withdrawalId;
    }

    public void setWithdrawalId(Integer withdrawalId) {
        this.withdrawalId = withdrawalId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public String getWithdrawalCard() {
        return withdrawalCard;
    }

    public void setWithdrawalCard(String withdrawalCard) {
        this.withdrawalCard = withdrawalCard;
    }

    public String getWithdrawalIdAddress() {
        return withdrawalIdAddress;
    }

    public void setWithdrawalIdAddress(String withdrawalIdAddress) {
        this.withdrawalIdAddress = withdrawalIdAddress;
    }

    public Integer getApplyType() {
        return applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getApplyPhone() {
        return applyPhone;
    }

    public void setApplyPhone(String applyPhone) {
        this.applyPhone = applyPhone;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
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

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
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
        return "JWithdrawal{" +
        "withdrawalId=" + withdrawalId +
        ", provinceId=" + provinceId +
        ", cityId=" + cityId +
        ", areaId=" + areaId +
        ", streetId=" + streetId +
        ", withdrawalCard=" + withdrawalCard +
        ", withdrawalIdAddress=" + withdrawalIdAddress +
        ", applyType=" + applyType +
        ", applyId=" + applyId +
        ", applyName=" + applyName +
        ", money=" + money +
        ", applyPhone=" + applyPhone +
        ", applyDate=" + applyDate +
        ", checkId=" + checkId +
        ", checkDate=" + checkDate +
        ", checkStatus=" + checkStatus +
        ", payId=" + payId +
        ", payDate=" + payDate +
        ", remark=" + remark +
        ", isDel=" + isDel +
        "}";
    }
}
