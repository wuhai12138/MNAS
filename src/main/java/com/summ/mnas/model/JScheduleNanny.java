package com.summ.mnas.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author summ
 * @since 2018-05-21
 */
@TableName("j_schedule_nanny")
public class JScheduleNanny implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("scheduleId")
    private Integer scheduleId;
    @TableField("nannyId")
    private Integer nannyId;
    /**
     * 区分服务师类型（-1表示带教1表示自营其他表示供应商id）
     */
    @TableField("supplierId")
    private Integer supplierId;
    /**
     * 评价
     */
    private String assess;
    /**
     * 评星
     */
    private Integer staring;

    private Date commentDate;
    private Integer commentStatus;

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getNannyId() {
        return nannyId;
    }

    public void setNannyId(Integer nannyId) {
        this.nannyId = nannyId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getAssess() {
        return assess;
    }

    public void setAssess(String assess) {
        this.assess = assess;
    }

    public Integer getStaring() {
        return staring;
    }

    public void setStaring(Integer staring) {
        this.staring = staring;
    }

    @Override
    public String toString() {
        return "JScheduleNanny{" +
        "id=" + id +
        ", scheduleId=" + scheduleId +
        ", nannyId=" + nannyId +
        ", supplierId=" + supplierId +
        ", assess=" + assess +
        ", staring=" + staring +
        "}";
    }
}
