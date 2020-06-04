package com.hx.application1.controller;

import com.hx.application1.client.ProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerController.class);

//    动态代理对象，内部远程调用服务生产者
    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/service")
    public String service() {
        LOGGER.info("consumer invoke");
//        远程调用
        String service = providerClient.service();
        return "comsumer invoke" + "|" + service;
    }
}
