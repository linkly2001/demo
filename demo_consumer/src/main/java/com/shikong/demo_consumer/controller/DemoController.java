package com.shikong.demo_consumer.controller;

import com.shikong.interfaces.interfaceX.IDemoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {
    @Resource
    private IDemoService demoServiceImpl;
    @ApiOperation(value="demo",notes ="sayHello")
    @ApiImplicitParam(paramType="query", name = "name", value = "用户名", required = true, dataType = "String")
    @RequestMapping(value="/demo",method ={RequestMethod.POST} )
    public String sayHello(@RequestParam String name){
        return demoServiceImpl.sayHello(name);
    }
}
