package com.example.sopservice.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sopservice.controller.param.ErpGoodsBrandAdd;
import com.example.sopservice.controller.param.ErpGoodsBrandParam;
import com.example.sopservice.controller.param.ErpGoodsBrandUpdate;
import com.example.sopservice.controller.result.ErpGoodsBrandDetailResult;
import com.example.sopservice.controller.result.ErpGoodsBrandResult;
import com.example.sopservice.entity.ErpGoodsBrand;

import java.util.List;

/**
 * 商品品牌表(ErpGoodsBrand)表服务接口
 *
 * @author makejava
 * @since 2020-09-08 13:59:50
 */
public interface ErpGoodsBrandService extends IService<ErpGoodsBrand> {

    IPage<ErpGoodsBrandResult> findPage(Page<ErpGoodsBrand> page, ErpGoodsBrandParam erpGoodsBrandParam);

    ErpGoodsBrandDetailResult findById(Integer id);

    boolean saveBrand(ErpGoodsBrandAdd brandAdd);

    boolean updateBrand(ErpGoodsBrandUpdate brandUpdate);

}