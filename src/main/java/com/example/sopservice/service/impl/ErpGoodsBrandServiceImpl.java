package com.example.sopservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sopservice.controller.param.ErpGoodsBrandAdd;
import com.example.sopservice.controller.param.ErpGoodsBrandParam;
import com.example.sopservice.controller.param.ErpGoodsBrandUpdate;
import com.example.sopservice.controller.result.ErpGoodsBrandDetailResult;
import com.example.sopservice.controller.result.ErpGoodsBrandResult;
import com.example.sopservice.controller.result.ErpGoodsCategoryReslut;
import com.example.sopservice.dao.ErpGoodsBrandDao;
import com.example.sopservice.dao.ErpGoodsSpuDao;
import com.example.sopservice.entity.ErpGoodsBrand;
import com.example.sopservice.entity.ErpGoodsCategory;
import com.example.sopservice.entity.ErpGoodsSpu;
import com.example.sopservice.service.ErpGoodsBrandService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 商品品牌表(ErpGoodsBrand)表服务实现类
 *
 * @author makejava
 * @since 2020-09-08 13:59:51
 */
@Service("erpGoodsBrandService")
public class ErpGoodsBrandServiceImpl extends ServiceImpl<ErpGoodsBrandDao, ErpGoodsBrand> implements ErpGoodsBrandService {

    @Autowired
    private ErpGoodsSpuDao erpGoodsSpuDao;


    @Override
    public IPage<ErpGoodsBrandResult> findPage(Page<ErpGoodsBrand> page, ErpGoodsBrandParam erpGoodsBrandParam) {
        ErpGoodsBrand brand = new ErpGoodsBrand();
        BeanUtils.copyProperties(erpGoodsBrandParam,brand);
        
        Page<ErpGoodsBrand> result = page(page, new QueryWrapper<>(brand));
        Page<ErpGoodsBrandResult> fResult = new Page<>();
        BeanUtils.copyProperties(result,fResult);

        List<ErpGoodsBrandResult> records = result.getRecords().stream().map(item -> {
            ErpGoodsBrandResult item2 = new ErpGoodsBrandResult();
            BeanUtils.copyProperties(item, item2);
            return item2;
        }).collect(Collectors.toList());
        fResult.setRecords(records);
        return fResult;
    }

    @Override
    public ErpGoodsBrandDetailResult findById(Integer id) {
        ErpGoodsBrand brand = getById(id);
        ErpGoodsBrandDetailResult brandResult = new ErpGoodsBrandDetailResult();
        BeanUtils.copyProperties(brand,brandResult);

        //todo  查询关联的分类列表
        List<ErpGoodsCategoryReslut> categoryList = Stream.of(new ErpGoodsCategoryReslut(), new ErpGoodsCategoryReslut()).collect(Collectors.toList());
        brandResult.setCategoryList(categoryList);

        return brandResult;
    }

    @Override
    public boolean saveBrand(ErpGoodsBrandAdd brandAdd) {
        ErpGoodsBrand brand = new ErpGoodsBrand();
        BeanUtils.copyProperties(brandAdd,brand);
        brand.setCreateTime(new Date());

        //todo
        brand.setCreated(0);
        brand.setUpdated(0);
        brand.setDelFlag(0);
        brand.setRemark("");
        return save(brand);
    }

    @Override
    public boolean updateBrand(ErpGoodsBrandUpdate brandUpdate) {
        ErpGoodsBrand brand = new ErpGoodsBrand();
        BeanUtils.copyProperties(brandUpdate,brand);
        brand.setUpdateTime(new Date());

        ErpGoodsSpu goodsSpu =new ErpGoodsSpu();
        goodsSpu.setGoodsBrandName(brand.getName());

        UpdateWrapper<ErpGoodsSpu> wrapper = new UpdateWrapper<>();
        wrapper.eq("goods_brand_id",brandUpdate.getId());
        erpGoodsSpuDao.update(goodsSpu,wrapper);
        return updateById(brand);
    }
}