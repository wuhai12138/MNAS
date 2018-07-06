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
@TableName("j_customer_statment")
public class JCustomerStatment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "statmentId", type = IdType.AUTO)
    private Integer statmentId;
    /**
     * 订单号
     */
    @TableField("statmentCustomer")
    private String statmentCustomer;
    @TableField("customerId")
    private Integer customerId;
    @TableField("goodsId")
    private Integer goodsId;
    @TableField("houseId")
    private Integer houseId;
    @TableField("orderType")
    private Integer orderType;
    @TableField("orderId")
    private Integer orderId;
    /**
     * 日程Id
     */
    @TableField("scheduleId")
    private Integer scheduleId;
    @TableField("couponListId")
    private Integer couponListId;
    @TableField("shopId")
    private Integer shopId;
    /**
     * 服务时间（几点到几点）
     */
    @TableField("serviceTime")
    private String serviceTime;
    /**
     * 服务时长
     */
    @TableField("serviceTimeLength")
    private Double serviceTimeLength;
    /**
     * 服务日期
     */
    @TableField("serviceDate")
    private Date serviceDate;
    /**
     * 支付回调时间
     */
    @TableField("notifyDate")
    private Date notifyDate;
    /**
     * 创建时间
     */
    @TableField("createDate")
    private Date createDate;
    /**
     * 支付日期
     */
    @TableField("chargeDate")
    private Date chargeDate;
    /**
     * 客户对账单类型
     */
    @TableField("statmentCustomerType")
    private Integer statmentCustomerType;
    /**
     * 支付金额
     */
    @TableField("chargeMoney")
    private BigDecimal chargeMoney;
    /**
     * 充值方式
     */
    @TableField("chargeWay")
    private Integer chargeWay;
    @TableField("adminId")
    private Integer adminId;
    /**
     * 终端
     */
    private Integer terminal;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 余额
     */
    private BigDecimal balance;
    /**
     * 流水号
     */
    @TableField("serialNumber")
    private String serialNumber;
    private String remark;
    @TableField("withdrawlCard")
    private String withdrawlCard;
    @TableField("withdrawlBank")
    private String withdrawlBank;
    /**
     * 是否对账
     */
    private Integer checking;
    /**
     * 对账日期
     */
    @TableField("checkingDate")
    private Date checkingDate;

    public JCustomerStatment() {
    }

    public JCustomerStatment(String statmentCustomer, Integer customerId, Integer goodsId, Integer houseId, Integer orderId, Integer orderType, Integer scheduleId, Integer shopId, String serviceTime, Double serviceTimeLength, Date serviceDate, Date chargeDate, Integer statmentCustomerType, BigDecimal chargeMoney, Integer chargeWay, Integer adminId, Integer terminal, Integer status, BigDecimal balance, String serialNumber, String remark) {
        this.statmentCustomer = statmentCustomer;
        this.customerId = customerId;
        this.goodsId = goodsId;
        this.houseId = houseId;
        this.orderId = orderId;
        this.orderType = orderType;
        this.scheduleId = scheduleId;
        this.shopId = shopId;
        this.serviceTime = serviceTime;
        this.serviceTimeLength = serviceTimeLength;
        this.serviceDate = serviceDate;
        this.chargeDate = chargeDate;
        this.statmentCustomerType = statmentCustomerType;
        this.chargeMoney = chargeMoney;
        this.chargeWay = chargeWay;
        this.adminId = adminId;
        this.terminal = terminal;
        this.status = status;
        this.balance = balance;
        this.serialNumber = serialNumber;
        this.remark = remark;
    }

    public JCustomerStatment(String statmentCustomer, Integer customerId, Integer goodsId, Integer houseId,
                             Integer orderId, Integer orderType, Integer scheduleId, Integer shopId, String serviceTime,
                             Double serviceTimeLength, Date serviceDate, Date chargeDate, Integer statmentCustomerType,
                             BigDecimal chargeMoney, Integer chargeWay, Integer adminId, Integer terminal, Integer status,
                             BigDecimal balance, String serialNumber, String remark,Integer couponListId) {
        this.statmentCustomer = statmentCustomer;
        this.customerId = customerId;
        this.goodsId = goodsId;
        this.houseId = houseId;
        this.orderId = orderId;
        this.orderType = orderType;
        this.scheduleId = scheduleId;
        this.shopId = shopId;
        this.serviceTime = serviceTime;
        this.serviceTimeLength = serviceTimeLength;
        this.serviceDate = serviceDate;
        this.chargeDate = chargeDate;
        this.statmentCustomerType = statmentCustomerType;
        this.chargeMoney = chargeMoney;
        this.chargeWay = chargeWay;
        this.adminId = adminId;
        this.terminal = terminal;
        this.status = status;
        this.balance = balance;
        this.serialNumber = serialNumber;
        this.remark = remark;
        this.couponListId = couponListId;
    }

    public Integer getStatmentId() {
        return statmentId;
    }

    public void setStatmentId(Integer statmentId) {
        this.statmentId = statmentId;
    }

    public String getStatmentCustomer() {
        return statmentCustomer;
    }

    public void setStatmentCustomer(String statmentCustomer) {
        this.statmentCustomer = statmentCustomer;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
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

    public Integer getCouponListId() {
        return couponListId;
    }

    public void setCouponListId(Integer couponListId) {
        this.couponListId = couponListId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }

    public Double getServiceTimeLength() {
        return serviceTimeLength;
    }

    public void setServiceTimeLength(Double serviceTimeLength) {
        this.serviceTimeLength = serviceTimeLength;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public Date getNotifyDate() {
        return notifyDate;
    }

    public void setNotifyDate(Date notifyDate) {
        this.notifyDate = notifyDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getChargeDate() {
        return chargeDate;
    }

    public void setChargeDate(Date chargeDate) {
        this.chargeDate = chargeDate;
    }

    public Integer getStatmentCustomerType() {
        return statmentCustomerType;
    }

    public void setStatmentCustomerType(Integer statmentCustomerType) {
        this.statmentCustomerType = statmentCustomerType;
    }

    public BigDecimal getChargeMoney() {
        return chargeMoney;
    }

    public void setChargeMoney(BigDecimal chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    public Integer getChargeWay() {
        return chargeWay;
    }

    public void setChargeWay(Integer chargeWay) {
        this.chargeWay = chargeWay;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getWithdrawlCard() {
        return withdrawlCard;
    }

    public void setWithdrawlCard(String withdrawlCard) {
        this.withdrawlCard = withdrawlCard;
    }

    public String getWithdrawlBank() {
        return withdrawlBank;
    }

    public void setWithdrawlBank(String withdrawlBank) {
        this.withdrawlBank = withdrawlBank;
    }

    public Integer getChecking() {
        return checking;
    }

    public void setChecking(Integer checking) {
        this.checking = checking;
    }

    public Date getCheckingDate() {
        return checkingDate;
    }

    public void setCheckingDate(Date checkingDate) {
        this.checkingDate = checkingDate;
    }

    @Override
    public String toString() {
        return "JCustomerStatment{" +
        "statmentId=" + statmentId +
        ", statmentCustomer=" + statmentCustomer +
        ", customerId=" + customerId +
        ", goodsId=" + goodsId +
        ", houseId=" + houseId +
        ", orderType=" + orderType +
        ", orderId=" + orderId +
        ", scheduleId=" + scheduleId +
        ", couponListId=" + couponListId +
        ", shopId=" + shopId +
        ", serviceTime=" + serviceTime +
        ", serviceTimeLength=" + serviceTimeLength +
        ", serviceDate=" + serviceDate +
        ", notifyDate=" + notifyDate +
        ", createDate=" + createDate +
        ", chargeDate=" + chargeDate +
        ", statmentCustomerType=" + statmentCustomerType +
        ", chargeMoney=" + chargeMoney +
        ", chargeWay=" + chargeWay +
        ", adminId=" + adminId +
        ", terminal=" + terminal +
        ", status=" + status +
        ", balance=" + balance +
        ", serialNumber=" + serialNumber +
        ", remark=" + remark +
        ", withdrawlCard=" + withdrawlCard +
        ", withdrawlBank=" + withdrawlBank +
        ", checking=" + checking +
        ", checkingDate=" + checkingDate +
        "}";
    }
}
