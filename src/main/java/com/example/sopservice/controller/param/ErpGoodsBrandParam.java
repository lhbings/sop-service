package com.example.sopservice.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ErpGoodsBrandParam {

    //主键
    @ApiModelProperty(value = "id",example = "1")
    private Integer id;

    @ApiModelProperty(value = "名称",example = "小米")
    private String name;
}
