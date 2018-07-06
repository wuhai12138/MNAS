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
@TableName("j_province")
public class JProvince implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "provinceId", type = IdType.AUTO)
    private Integer provinceId;
    @TableField("provinceCode")
    private String provinceCode;
    @TableField("provinceName")
    private String provinceName;


    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public String toString() {
        return "JProvince{" +
        "provinceId=" + provinceId +
        ", provinceCode=" + provinceCode +
        ", provinceName=" + provinceName +
        "}";
    }
}
