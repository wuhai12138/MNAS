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
@TableName("j_city")
public class JCity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cityId", type = IdType.AUTO)
    private Integer cityId;
    @TableField("cityCode")
    private String cityCode;
    @TableField("cityName")
    private String cityName;
    @TableField("provinceCode")
    private String provinceCode;


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Override
    public String toString() {
        return "JCity{" +
        "cityId=" + cityId +
        ", cityCode=" + cityCode +
        ", cityName=" + cityName +
        ", provinceCode=" + provinceCode +
        "}";
    }
}
