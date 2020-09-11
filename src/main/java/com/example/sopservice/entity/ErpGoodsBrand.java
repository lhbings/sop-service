package com.example.sopservice.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品品牌表(ErpGoodsBrand)表实体类
 *
 * @author makejava
 * @since 2020-09-08 13:59:49
 */
@SuppressWarnings("serial")
@Data
public class ErpGoodsBrand extends Model<ErpGoodsBrand> {
    //主键
    private Integer id;
    //品牌名
    private String name;
    //品牌logo
    private String logo;
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
    @TableLogic
    private Integer delFlag;


    public ErpGoodsBrand() {
    }

    public ErpGoodsBrand(Integer id) {
        this.id = id;
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