package com.hx.microservice.service1.service;


import com.hx.microservice.service1.api.ConsumerService;
import com.hx.microservice.service2.service.api.ProviderService;

// 注解表示
// 此类的方法将来要暴露为Dubbo接口
@org.apache.dubbo.config.annotation.Service
public class ConsumerServiceImpl implements ConsumerService {

//    注入service
    @org.apache.dubbo.config.annotation.Reference
    ProviderService providerService;

    // Dubbo接口的内容
//    @Override
    public String service() {
//         service1 调用 service2
        String service = providerService.service();
        return "Consumer1 invoke--" + service;
//        return "Consumer invoke";
    }
}
