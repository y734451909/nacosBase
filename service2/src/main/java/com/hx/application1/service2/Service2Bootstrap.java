package com.hx.application1.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Service2Bootstrap {

    public static void main(String[] args) {
        SpringApplication.run(Service2Bootstrap.class, args);

    }

    @Autowired
    ConfigurableApplicationContext applicationContext;
    public String config1;

    @GetMapping(value = "/configs")
    public String getConfigs(){
//        读取配置信息
        System.out.println("读取配置信息");
        String str;
        str=applicationContext.getEnvironment().getProperty("common.name");
        System.out.println(str);


        return "common.name";
    }
}
