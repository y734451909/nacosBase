package com.hx.application1.controller;

import com.hx.microservice.service1.api.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    //注入service 基于dubbo协议
    @org.apache.dubbo.config.annotation.Reference //生成代理对象，通过代理对象进行远程调用
    ConsumerService consumerService;

    @GetMapping("/service")
    public String service() {
//        远程调用
        String service = consumerService.service();
        return "test" + service;
    }
}
