package com.example.sopservice.controller.result;

import com.example.sopservice.entity.ErpGoodsBrand;
import com.example.sopservice.entity.ErpGoodsCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ErpGoodsBrandDetailResult {

    @ApiModelProperty(value = "id",example = "1")
    private Integer id;
    //品牌名
    @ApiModelProperty(value = "名称",example = "小米")
    private String name;
    //品牌logo
    @ApiModelProperty(value = "logo图片地址",example = "")
    private String logo;
    //创建时间
    @ApiModelProperty(value = "创建时间",example = "2020-08-06")
    private Date createTime;

    @ApiModelProperty(value = "分类列表",example = "")
    private List<ErpGoodsCategoryReslut> categoryList;


}
