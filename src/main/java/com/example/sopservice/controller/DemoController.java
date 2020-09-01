package com.example.sopservice.controller;

import com.example.sopservice.controller.param.DemoParam;
import com.example.sopservice.controller.result.DemoResult;
import com.gitee.sop.servercommon.annotation.Open;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("demo")
public class DemoController {


    @ApiOperation(value = "demo查询详情",notes = "查询id，名称等详细信息")
    @Open(value = "service.demo.get",version = "1.0")
    @RequestMapping("get")
    public DemoResult getResult( DemoParam param) {

       /* if (StringUtils.isEmpty(param.getName())) {
            throw DemoErrorEnum.NO_NAME.getErrorMeta().getException();
//            throw new ServiceException("100","名称不可为空！");
        }*/
        DemoResult result = new DemoResult();
        result.setId(param.getId());
        result.setTime(new Date().getTime());
        return result;
    }

    @Open(value = "service.demo.hello",version = "1.0")
    @RequestMapping("hello")
    public String sayHello(){
        return "你好";
    }

}
