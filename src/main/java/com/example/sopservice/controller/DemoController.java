package com.example.sopservice.controller;

import com.example.sopservice.controller.param.DemoParam;
import com.example.sopservice.controller.result.DemoResult;
import com.gitee.sop.servercommon.annotation.Open;
import io.swagger.annotations.ApiOperation;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {


    @RequestMapping("hello")
    public String sayHello(){
        return "你好";
    }

}
