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
 * @since 2018-05-14
 */
@TableName("j_system_auth_code")
public class JSystemAuthCode implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "codeId", type = IdType.AUTO)
    private Integer codeId;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 验证码
     */
    @TableField("authCode")
    private String authCode;
    @TableField("createTime")
    private Date createTime;

    public JSystemAuthCode(String phone, String authCode, Date createTime) {
        this.phone = phone;
        this.authCode = authCode;
        this.createTime = createTime;
    }

    public JSystemAuthCode() {
    }

    public Integer getCodeId() {
        return codeId;
    }

    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "JSystemAuthCode{" +
        "codeId=" + codeId +
        ", phone=" + phone +
        ", authCode=" + authCode +
        ", createTime=" + createTime +
        "}";
    }
}
