package com.example.sopservice.controller.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class DemoResult {

    @ApiModelProperty(value = "id",example = "1")
    private Long id;

    @ApiModelProperty(value = "响应时间",example = "1598516865098")
    private long time;

}
