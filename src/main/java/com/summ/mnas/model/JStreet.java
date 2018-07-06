package com.summ.mnas.model;

import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("j_street")
public class JStreet implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "streetId", type = IdType.AUTO)
    private Integer streetId;
    @TableField("streetCode")
    private String streetCode;
    @TableField("streetName")
    private String streetName;
    @TableField("areaCode")
    private String areaCode;


    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Override
    public String toString() {
        return "JStreet{" +
        "streetId=" + streetId +
        ", streetCode=" + streetCode +
        ", streetName=" + streetName +
        ", areaCode=" + areaCode +
        "}";
    }
}
