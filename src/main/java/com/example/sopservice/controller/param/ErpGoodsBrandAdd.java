package com.example.sopservice.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class ErpGoodsBrandAdd {
    //品牌名
    @ApiModelProperty(value = "名称",example = "小米")
    @NotBlank(message = "名称不可为空")
    private String name;
    //品牌logo
    @ApiModelProperty(value = "logo图片地址",example = "example")
    @NotBlank(message = "图片地址不可为空")
    private String logo;

    @ApiModelProperty(value = "其他ids",example = "[1,2,3]")
    private List<Integer> categoryIds;


}
