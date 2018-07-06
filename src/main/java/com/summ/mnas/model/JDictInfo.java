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
@TableName("j_dict_info")
public class JDictInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;
    private Integer typecode;
    private Integer dictcode;
    private String info;
    @TableField("isDel")
    private Integer isDel;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypecode() {
        return typecode;
    }

    public void setTypecode(Integer typecode) {
        this.typecode = typecode;
    }

    public Integer getDictcode() {
        return dictcode;
    }

    public void setDictcode(Integer dictcode) {
        this.dictcode = dictcode;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "JDictInfo{" +
        "id=" + id +
        ", typecode=" + typecode +
        ", dictcode=" + dictcode +
        ", info=" + info +
        ", isDel=" + isDel +
        "}";
    }
}
