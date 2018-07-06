package com.summ.mnas.model.request;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author summ
 * @since 2018-06-11
 */
public class CustomerPrepaidReq implements Serializable {


    /**
     * 客户预约表
     */
    private Integer customerId;
    private Integer prepaidStatus;
    private Integer page;
    private Integer size;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }


    public Integer getPrepaidStatus() {
        return prepaidStatus;
    }

    public void setPrepaidStatus(Integer prepaidStatus) {
        this.prepaidStatus = prepaidStatus;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
