package com.example.sopservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sopservice.entity.ErpGoodsSpu;
import com.example.sopservice.service.ErpGoodsSpuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 商品表(ErpGoodsSpu)表控制层
 *
 * @author makejava
 * @since 2020-09-10 17:57:45
 */
@RestController
@RequestMapping("erpGoodsSpu")
public class ErpGoodsSpuController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ErpGoodsSpuService erpGoodsSpuService;

    /**
     * 分页查询所有数据
     *
     * @param page        分页对象
     * @param erpGoodsSpu 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<ErpGoodsSpu> page, ErpGoodsSpu erpGoodsSpu) {
        return success(this.erpGoodsSpuService.page(page, new QueryWrapper<>(erpGoodsSpu)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.erpGoodsSpuService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param erpGoodsSpu 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody ErpGoodsSpu erpGoodsSpu) {
        return success(this.erpGoodsSpuService.save(erpGoodsSpu));
    }

    /**
     * 修改数据
     *
     * @param erpGoodsSpu 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody ErpGoodsSpu erpGoodsSpu) {
        return success(this.erpGoodsSpuService.updateById(erpGoodsSpu));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.erpGoodsSpuService.removeByIds(idList));
    }
}