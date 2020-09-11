package com.example.sopservice.controller.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ErpGoodsCategoryReslut {
    //主键
    @ApiModelProperty(value = "分类id",example = "1")
    private Integer id;

    //分类名称
    @ApiModelProperty(value = "分类名称",example = "电视")
    private String name;
}
