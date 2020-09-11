package com.example.sopservice.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品表(ErpGoodsSpu)表实体类
 *
 * @author makejava
 * @since 2020-09-10 17:57:44
 */
@SuppressWarnings("serial")
public class ErpGoodsSpu extends Model<ErpGoodsSpu> {
    //主键
    private Integer id;
    //产品分类id
    private Integer goodsCategoryId;
    //产品分类名
    private String goodsCategoryName;
    //产品品牌id
    private Integer goodsBrandId;
    //产品品牌名
    private String goodsBrandName;
    //产品型号id
    private Integer goodsModelId;
    //产品型号名称
    private String goodsModelName;
    //产品名称
    private String name;
    //副标题
    private String subTitle;
    //关键字
    private String keywords;
    //产品编码
    private String spuCode;
    //商品条码
    private String barCode;
    //虚实类型 0为实质产品 1为虚拟产品
    private Integer type;
    //上架状态 0为下架 1为上架
    private Integer publishStatus;
    //创建人id
    private Integer created;
    //创建时间
    private Date createTime;
    //更新人id
    private Integer updated;
    //更新时间
    private Date updateTime;
    //备注
    private String remark;
    //是否删除 0为未删除 1为已删除
    private Integer delFlag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(Integer goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public String getGoodsCategoryName() {
        return goodsCategoryName;
    }

    public void setGoodsCategoryName(String goodsCategoryName) {
        this.goodsCategoryName = goodsCategoryName;
    }

    public Integer getGoodsBrandId() {
        return goodsBrandId;
    }

    public void setGoodsBrandId(Integer goodsBrandId) {
        this.goodsBrandId = goodsBrandId;
    }

    public String getGoodsBrandName() {
        return goodsBrandName;
    }

    public void setGoodsBrandName(String goodsBrandName) {
        this.goodsBrandName = goodsBrandName;
    }

    public Integer getGoodsModelId() {
        return goodsModelId;
    }

    public void setGoodsModelId(Integer goodsModelId) {
        this.goodsModelId = goodsModelId;
    }

    public String getGoodsModelName() {
        return goodsModelName;
    }

    public void setGoodsModelName(String goodsModelName) {
        this.goodsModelName = goodsModelName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getSpuCode() {
        return spuCode;
    }

    public void setSpuCode(String spuCode) {
        this.spuCode = spuCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}