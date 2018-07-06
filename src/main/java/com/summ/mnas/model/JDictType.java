package com.summ.mnas.model;

import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author summ
 * @since 2018-05-15
 */
@TableName("j_dict_type")
public class JDictType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "TYPECODE", type = IdType.AUTO)
    private Integer typecode;
    private String typename;


    public Integer getTypecode() {
        return typecode;
    }

    public void setTypecode(Integer typecode) {
        this.typecode = typecode;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        return "JDictType{" +
        "typecode=" + typecode +
        ", typename=" + typename +
        "}";
    }
}
