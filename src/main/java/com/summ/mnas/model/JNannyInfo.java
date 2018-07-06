package com.summ.mnas.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author summ
 * @since 2018-05-21
 */
@TableName("j_nanny_info")
public class JNannyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nannyId", type = IdType.AUTO)
    private Integer nannyId;
    /**
     * 头像
     */
    @TableField("nannyAvatar")
    private String nannyAvatar;
    /**
     * 服务师姓名
     */
    @TableField("nannyName")
    private String nannyName;
    @TableField("nannySex")
    private Integer nannySex;
    @TableField("nannyStatus")
    private Integer nannyStatus;
    @TableField("nannyType")
    private Integer nannyType;
    /**
     * 3星4星5星
     */
    @TableField("nannyLevel")
    private Integer nannyLevel;
    /**
     * 支付方式
     */
    private Integer payment;
    @TableField("nannyPhone")
    private String nannyPhone;
    @TableField("provinceId")
    private Integer provinceId;
    @TableField("cityId")
    private Integer cityId;
    @TableField("areaId")
    private Integer areaId;
    @TableField("streetId")
    private Integer streetId;
    @TableField("nannyAddress")
    private String nannyAddress;
    @TableField("nannyIdCard")
    private String nannyIdCard;
    /**
     * 身份证有效期
     */
    @TableField("idValidDate")
    private Date idValidDate;
    @TableField("nannyBirthday")
    private String nannyBirthday;
    @TableField("nannyAge")
    private Integer nannyAge;
    /**工作年限*/
    private Integer nannyExperence;
    /**
     * 属相
     */
    @TableField("nannyAnimalSign")
    private Integer nannyAnimalSign;
    @TableField("nannyNation")
    private Integer nannyNation;
    /**
     * 籍贯
     */
    @TableField("nannyOrigin")
    private Integer nannyOrigin;
    @TableField("nannyHeight")
    private String nannyHeight;
    @TableField("nannyWeight")
    private String nannyWeight;
    @TableField("nannyEducation")
    private Integer nannyEducation;
    /**
     * 开户行
     */
    @TableField("salaryBank")
    private String salaryBank;
    /**
     * 工资卡
     */
    @TableField("salaryCard")
    private String salaryCard;
    /**
     * 期望薪资
     */
    @TableField("expectSalary")
    private BigDecimal expectSalary;
    /**
     * 中介费
     */
    @TableField("nannyAgencyFees")
    private BigDecimal nannyAgencyFees;
    /**
     * 保证金
     */
    @TableField("nannyCashPledge")
    private BigDecimal nannyCashPledge;
    /**
     * 中介费有效期
     */
    @TableField("agencyValidDate")
    private Date agencyValidDate;
    @TableField("agencyPayStatus")
    private Integer agencyPayStatus;
    /**
     * 服务师是否常用168（常用）169（不常用）
     */
    private Integer hot;
    /**
     * 服务师案件数量
     */
    private Integer caseload;
    private String remark;
    @TableField("createId")
    private Integer createId;
    @TableField("createTime")
    private Date createTime;
    @TableField("modifyId")
    private Integer modifyId;
    @TableField("modifyTime")
    private Date modifyTime;
    /**
     * 离职时间
     */
    @TableField("dimissionTime")
    private Date dimissionTime;
    /**
     * 服务师信息验证状态
     */
    @TableField("dataSignStatus")
    private Integer dataSignStatus;
    @TableField("isDel")
    private Integer isDel;

    /** 微信小程序openId */
    private String WeiXinOpenId;

    /** 支付宝小程序openId */
    private String AlyOpenId;

    public Integer getNannyExperence() {
        return nannyExperence;
    }

    public void setNannyExperence(Integer nannyExperence) {
        this.nannyExperence = nannyExperence;
    }

    public String getWeiXinOpenId() {
        return WeiXinOpenId;
    }

    public void setWeiXinOpenId(String weiXinOpenId) {
        WeiXinOpenId = weiXinOpenId;
    }

    public String getAlyOpenId() {
        return AlyOpenId;
    }

    public void setAlyOpenId(String alyOpenId) {
        AlyOpenId = alyOpenId;
    }

    public Integer getNannyId() {
        return nannyId;
    }

    public void setNannyId(Integer nannyId) {
        this.nannyId = nannyId;
    }

    public String getNannyAvatar() {
        return nannyAvatar;
    }

    public void setNannyAvatar(String nannyAvatar) {
        this.nannyAvatar = nannyAvatar;
    }

    public String getNannyName() {
        return nannyName;
    }

    public void setNannyName(String nannyName) {
        this.nannyName = nannyName;
    }

    public Integer getNannySex() {
        return nannySex;
    }

    public void setNannySex(Integer nannySex) {
        this.nannySex = nannySex;
    }

    public Integer getNannyStatus() {
        return nannyStatus;
    }

    public void setNannyStatus(Integer nannyStatus) {
        this.nannyStatus = nannyStatus;
    }

    public Integer getNannyType() {
        return nannyType;
    }

    public void setNannyType(Integer nannyType) {
        this.nannyType = nannyType;
    }

    public Integer getNannyLevel() {
        return nannyLevel;
    }

    public void setNannyLevel(Integer nannyLevel) {
        this.nannyLevel = nannyLevel;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getNannyPhone() {
        return nannyPhone;
    }

    public void setNannyPhone(String nannyPhone) {
        this.nannyPhone = nannyPhone;
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

    public String getNannyAddress() {
        return nannyAddress;
    }

    public void setNannyAddress(String nannyAddress) {
        this.nannyAddress = nannyAddress;
    }

    public String getNannyIdCard() {
        return nannyIdCard;
    }

    public void setNannyIdCard(String nannyIdCard) {
        this.nannyIdCard = nannyIdCard;
    }

    public Date getIdValidDate() {
        return idValidDate;
    }

    public void setIdValidDate(Date idValidDate) {
        this.idValidDate = idValidDate;
    }

    public String getNannyBirthday() {
        return nannyBirthday;
    }

    public void setNannyBirthday(String nannyBirthday) {
        this.nannyBirthday = nannyBirthday;
    }

    public Integer getNannyAge() {
        return nannyAge;
    }

    public void setNannyAge(Integer nannyAge) {
        this.nannyAge = nannyAge;
    }

    public Integer getNannyAnimalSign() {
        return nannyAnimalSign;
    }

    public void setNannyAnimalSign(Integer nannyAnimalSign) {
        this.nannyAnimalSign = nannyAnimalSign;
    }

    public Integer getNannyNation() {
        return nannyNation;
    }

    public void setNannyNation(Integer nannyNation) {
        this.nannyNation = nannyNation;
    }

    public Integer getNannyOrigin() {
        return nannyOrigin;
    }

    public void setNannyOrigin(Integer nannyOrigin) {
        this.nannyOrigin = nannyOrigin;
    }

    public String getNannyHeight() {
        return nannyHeight;
    }

    public void setNannyHeight(String nannyHeight) {
        this.nannyHeight = nannyHeight;
    }

    public String getNannyWeight() {
        return nannyWeight;
    }

    public void setNannyWeight(String nannyWeight) {
        this.nannyWeight = nannyWeight;
    }

    public Integer getNannyEducation() {
        return nannyEducation;
    }

    public void setNannyEducation(Integer nannyEducation) {
        this.nannyEducation = nannyEducation;
    }

    public String getSalaryBank() {
        return salaryBank;
    }

    public void setSalaryBank(String salaryBank) {
        this.salaryBank = salaryBank;
    }

    public String getSalaryCard() {
        return salaryCard;
    }

    public void setSalaryCard(String salaryCard) {
        this.salaryCard = salaryCard;
    }

    public BigDecimal getExpectSalary() {
        return expectSalary;
    }

    public void setExpectSalary(BigDecimal expectSalary) {
        this.expectSalary = expectSalary;
    }

    public BigDecimal getNannyAgencyFees() {
        return nannyAgencyFees;
    }

    public void setNannyAgencyFees(BigDecimal nannyAgencyFees) {
        this.nannyAgencyFees = nannyAgencyFees;
    }

    public BigDecimal getNannyCashPledge() {
        return nannyCashPledge;
    }

    public void setNannyCashPledge(BigDecimal nannyCashPledge) {
        this.nannyCashPledge = nannyCashPledge;
    }

    public Date getAgencyValidDate() {
        return agencyValidDate;
    }

    public void setAgencyValidDate(Date agencyValidDate) {
        this.agencyValidDate = agencyValidDate;
    }

    public Integer getAgencyPayStatus() {
        return agencyPayStatus;
    }

    public void setAgencyPayStatus(Integer agencyPayStatus) {
        this.agencyPayStatus = agencyPayStatus;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Integer getCaseload() {
        return caseload;
    }

    public void setCaseload(Integer caseload) {
        this.caseload = caseload;
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

    public Date getDimissionTime() {
        return dimissionTime;
    }

    public void setDimissionTime(Date dimissionTime) {
        this.dimissionTime = dimissionTime;
    }

    public Integer getDataSignStatus() {
        return dataSignStatus;
    }

    public void setDataSignStatus(Integer dataSignStatus) {
        this.dataSignStatus = dataSignStatus;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "JNannyInfo{" +
        "nannyId=" + nannyId +
        ", nannyAvatar=" + nannyAvatar +
        ", nannyName=" + nannyName +
        ", nannySex=" + nannySex +
        ", nannyStatus=" + nannyStatus +
        ", nannyType=" + nannyType +
        ", nannyLevel=" + nannyLevel +
        ", payment=" + payment +
        ", nannyPhone=" + nannyPhone +
        ", provinceId=" + provinceId +
        ", cityId=" + cityId +
        ", areaId=" + areaId +
        ", streetId=" + streetId +
        ", nannyAddress=" + nannyAddress +
        ", nannyIdCard=" + nannyIdCard +
        ", idValidDate=" + idValidDate +
        ", nannyBirthday=" + nannyBirthday +
        ", nannyAge=" + nannyAge +
        ", nannyAnimalSign=" + nannyAnimalSign +
        ", nannyNation=" + nannyNation +
        ", nannyOrigin=" + nannyOrigin +
        ", nannyHeight=" + nannyHeight +
        ", nannyWeight=" + nannyWeight +
        ", nannyEducation=" + nannyEducation +
        ", salaryBank=" + salaryBank +
        ", salaryCard=" + salaryCard +
        ", expectSalary=" + expectSalary +
        ", nannyAgencyFees=" + nannyAgencyFees +
        ", nannyCashPledge=" + nannyCashPledge +
        ", agencyValidDate=" + agencyValidDate +
        ", agencyPayStatus=" + agencyPayStatus +
        ", hot=" + hot +
        ", caseload=" + caseload +
        ", remark=" + remark +
        ", createId=" + createId +
        ", createTime=" + createTime +
        ", modifyId=" + modifyId +
        ", modifyTime=" + modifyTime +
        ", dimissionTime=" + dimissionTime +
        ", dataSignStatus=" + dataSignStatus +
        ", isDel=" + isDel +
        "}";
    }
}
