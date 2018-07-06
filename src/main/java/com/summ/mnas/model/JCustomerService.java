package com.summ.mnas.model;

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
@TableName("j_customer_service")
public class JCustomerService implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "serviceId", type = IdType.AUTO)
    private Integer serviceId;
    @TableField("customerId")
    private Integer customerId;
    @TableField("productId")
    private Integer productId;
    @TableField("houseId")
    private Integer houseId;
    @TableField("teacherId")
    private Integer teacherId;
    @TableField("adminId")
    private Integer adminId;
    @TableField("shopId")
    private Integer shopId;
    @TableField("adminConfirm")
    private Integer adminConfirm;
    @TableField("customerConfirm")
    private Integer customerConfirm;
    @TableField("serviceDetail")
    private String serviceDetail;
    @TableField("createTime")
    private Date createTime;
    @TableField("serviceName")
    private String serviceName;


    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getAdminConfirm() {
        return adminConfirm;
    }

    public void setAdminConfirm(Integer adminConfirm) {
        this.adminConfirm = adminConfirm;
    }

    public Integer getCustomerConfirm() {
        return customerConfirm;
    }

    public void setCustomerConfirm(Integer customerConfirm) {
        this.customerConfirm = customerConfirm;
    }

    public String getServiceDetail() {
        return serviceDetail;
    }

    public void setServiceDetail(String serviceDetail) {
        this.serviceDetail = serviceDetail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "JCustomerService{" +
        "serviceId=" + serviceId +
        ", customerId=" + customerId +
        ", productId=" + productId +
        ", houseId=" + houseId +
        ", teacherId=" + teacherId +
        ", adminId=" + adminId +
        ", shopId=" + shopId +
        ", adminConfirm=" + adminConfirm +
        ", customerConfirm=" + customerConfirm +
        ", serviceDetail=" + serviceDetail +
        ", createTime=" + createTime +
        ", serviceName=" + serviceName +
        "}";
    }
}
