package com.example.sopservice.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品分类表(ErpGoodsCategory)表实体类
 *
 * @author makejava
 * @since 2020-09-08 17:24:53
 */
@SuppressWarnings("serial")
public class ErpGoodsCategory extends Model<ErpGoodsCategory> {
    //主键
    private Integer id;
    //u8分类id
    private Integer goodsCategoryU8Id;
    //分类名称
    private String name;
    //父节点id 0为根节点
    private String parentId;
    //分类层级 0为1级 1为2级
    private Integer level;
    //关键字
    private String keywords;
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

    public ErpGoodsCategory() {
    }

    public ErpGoodsCategory(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsCategoryU8Id() {
        return goodsCategoryU8Id;
    }

    public void setGoodsCategoryU8Id(Integer goodsCategoryU8Id) {
        this.goodsCategoryU8Id = goodsCategoryU8Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
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