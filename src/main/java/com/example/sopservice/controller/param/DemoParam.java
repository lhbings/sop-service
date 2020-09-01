package com.example.sopservice.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
/*dev change*/
@Data
public class DemoParam {

    @ApiModelProperty(value = "id",example = "1")
    private Long id;

    @ApiModelProperty(value = "名称",example = "demo服务")
    @NotEmpty(message = "名称不可为空！！！")
    private String name;

}
