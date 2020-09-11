package com.example.sopservice.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sopservice.controller.param.ErpGoodsBrandAdd;
import com.example.sopservice.controller.param.ErpGoodsBrandParam;
import com.example.sopservice.controller.param.ErpGoodsBrandUpdate;
import com.example.sopservice.controller.result.ErpGoodsBrandDetailResult;
import com.example.sopservice.controller.result.ErpGoodsBrandResult;
import com.example.sopservice.entity.ErpGoodsBrand;
import com.example.sopservice.service.ErpGoodsBrandService;
import com.gitee.sop.servercommon.annotation.BizCode;
import com.gitee.sop.servercommon.annotation.Open;
import com.gitee.sop.servercommon.exception.ServiceException;
import io.swagger.annotations.*;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品品牌表(ErpGoodsBrand)表控制层
 *
 * @author makejava
 * @since 2020-09-08 13:59:52
 */
@Api(tags = "品牌接口")
@RestController
@RequestMapping("erpGoodsBrand")
public class ErpGoodsBrandController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ErpGoodsBrandService erpGoodsBrandService;

  /*  *
     * 分页查询所有数据
     *
     * @param page          分页对象
     * @param brandParam 查询实体
     * @return 所有数据*/
    @Open(value = "base.brands.page")
    @ApiOperation(value = "品牌分页查询",notes = "支持分页查询商品品牌")
    @ApiImplicitParams({@ApiImplicitParam(name = "current", value = "当前页数", example = "1"),
                    @ApiImplicitParam(name = "size", value = "每页条数", example = "10")})
    @GetMapping
    public IPage<ErpGoodsBrandResult> selectAll(Long current ,Long size, ErpGoodsBrandParam brandParam) {
        Page<ErpGoodsBrand> page = new Page<>();
        page.setCurrent(current!=null?current:1);
        page.setSize(size!=null?size:10);
        return this.erpGoodsBrandService.findPage(page,brandParam);
    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @Open(value = "base.brands.get",bizCode = {@BizCode(code = "10001",msg="品牌id为空",solution = "请选择品牌id")})
    @ApiOperation(value = "品牌详情查询",notes = "品牌详情")
    @ApiImplicitParams({@ApiImplicitParam(name = "id",value = "品牌id",example = "1",required = true,dataType = "integer")})
    @GetMapping("{id}")
    public ErpGoodsBrandDetailResult selectOne(@PathVariable Integer id) {
        return this.erpGoodsBrandService.findById(id);
    }

    /**
     * 新增数据
     *
     * @param brandAdd 实体对象
     * @return 新增结果
     */
//    @Open(value = "base.brands.save")
    @ApiOperation(value = "新增品牌")
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public boolean insert(@Validated @RequestBody ErpGoodsBrandAdd brandAdd, Errors errors) {
        if(errors.hasFieldErrors()){
            throw new ServiceException(errors.getFieldError().getField()+errors.getFieldError().getDefaultMessage());
        }
        return this.erpGoodsBrandService.saveBrand(brandAdd);
    }

    /**
     * 修改数据
     *
     * @param brandUpdate 实体对象
     * @return 修改结果
     */
//    @Open(value = "base.brands.update")
    @ApiOperation(value = "修改品牌")
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public boolean update(@Validated @RequestBody ErpGoodsBrandUpdate brandUpdate,Errors errors) {
        if(errors.hasFieldErrors()){
            throw new ServiceException(errors.getFieldError().getDefaultMessage());
        }
        return this.erpGoodsBrandService.updateBrand(brandUpdate);
    }

    /**
     * 删除数据
     *
     * @param ids 主键结合
     * @return 删除结果
     */
    @Open(value = "base.brands.delete")
    @ApiOperation(value = "批量删除品牌")
    @ApiImplicitParams({@ApiImplicitParam(name = "ids",value = "id集合",example = "[1,2,3]",required = true,allowMultiple = true)})
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public boolean delete(@RequestParam("ids") List<Integer> ids) {
        return this.erpGoodsBrandService.removeByIds(ids);
    }
}