package com.example.sopservice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sopservice.entity.ErpGoodsBrand;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品品牌表(ErpGoodsBrand)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-08 13:59:50
 */
@Mapper
public interface ErpGoodsBrandDao extends BaseMapper<ErpGoodsBrand> {

}