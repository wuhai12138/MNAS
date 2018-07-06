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
@TableName("j_area")
public class JArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "areaId", type = IdType.AUTO)
    private Integer areaId;
    @TableField("areaCode")
    private String areaCode;
    @TableField("areaName")
    private String areaName;
    @TableField("cityCode")
    private String cityCode;


    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public String toString() {
        return "JArea{" +
        "areaId=" + areaId +
        ", areaCode=" + areaCode +
        ", areaName=" + areaName +
        ", cityCode=" + cityCode +
        "}";
    }
}
