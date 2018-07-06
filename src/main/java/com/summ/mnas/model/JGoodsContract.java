package com.summ.mnas.model;

import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
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
@TableName("j_goods_contract")
public class JGoodsContract implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "goodsId", type = IdType.AUTO)
    private Integer goodsId;
    /**
     * 服务名称
     */
    private String service;
    private BigDecimal price;
    /**
     * 结算方式(暂时不用)
     */
    private String settlement;
    @TableField("orderType")
    private Integer orderType;
    /**
     * 单位
     */
    @TableField("unitName")
    private String unitName;
    /**
     * 表示上下架(16上架，17下架)
     */
    @TableField("isDel")
    private Integer isDel;
    /**
     * 最低限制
     */
    private Integer lowest;
    /**
     * 服务说明
     */
    private String summary;
    private String html1;
    private String html2;
    private String html3;
    private String banner;
    private Integer goodsType;

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public String getHtml1() {
        return html1;
    }

    public void setHtml1(String html1) {
        this.html1 = html1;
    }

    public String getHtml2() {
        return html2;
    }

    public void setHtml2(String html2) {
        this.html2 = html2;
    }

    public String getHtml3() {
        return html3;
    }

    public void setHtml3(String html3) {
        this.html3 = html3;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getLowest() {
        return lowest;
    }

    public void setLowest(Integer lowest) {
        this.lowest = lowest;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "JGoodsContract{" +
        "goodsId=" + goodsId +
        ", service=" + service +
        ", price=" + price +
        ", settlement=" + settlement +
        ", orderType=" + orderType +
        ", unitName=" + unitName +
        ", isDel=" + isDel +
        ", lowest=" + lowest +
        ", summary=" + summary +
        "}";
    }
}
