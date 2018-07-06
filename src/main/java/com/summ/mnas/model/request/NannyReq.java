package com.summ.mnas.model.request;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class NannyReq {
    @ApiModelProperty(value = "保姆类型")
    private Integer goodsId;
    @ApiModelProperty(value = "服务内容列表")
    private List<Integer> skillIdList;
    private Integer startAge;
    private Integer endAge;
    /**工作年限*/
    @ApiModelProperty(value = "工作年限")
    private Integer startExperence;
    @ApiModelProperty(value = "工作年限")
    private Integer endExperence;
    private Integer page;
    private Integer size;


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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public List<Integer> getSkillIdList() {
        return skillIdList;
    }

    public void setSkillIdList(List<Integer> skillIdList) {
        this.skillIdList = skillIdList;
    }

    public Integer getStartAge() {
        return startAge;
    }

    public void setStartAge(Integer startAge) {
        this.startAge = startAge;
    }

    public Integer getEndAge() {
        return endAge;
    }

    public void setEndAge(Integer endAge) {
        this.endAge = endAge;
    }

    public Integer getStartExperence() {
        return startExperence;
    }

    public void setStartExperence(Integer startExperence) {
        this.startExperence = startExperence;
    }

    public Integer getEndExperence() {
        return endExperence;
    }

    public void setEndExperence(Integer endExperence) {
        this.endExperence = endExperence;
    }
}
