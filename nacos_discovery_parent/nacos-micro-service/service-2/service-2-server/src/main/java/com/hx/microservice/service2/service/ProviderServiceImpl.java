package com.hx.microservice.service2.service;

import com.hx.microservice.service2.service.api.ProviderService;

@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {

//    @Override
    public String service() {
        return "--provider2 invoke";
    }
}
