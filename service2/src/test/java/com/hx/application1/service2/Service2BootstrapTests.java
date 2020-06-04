package com.hx.application1.service2;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
public class Service2BootstrapTests {



    @Autowired
    ConfigurableApplicationContext applicationContext;
    public String config1;

    @Test
    void prt()
    {
        System.out.println("Just Test!");
        getConfigs();
    }

    public String getConfigs(){
//        读取配置信息
        System.out.println("读取配置信息");
        String str;
        str=applicationContext.getEnvironment().getProperty("common.name");
        System.out.println(str);


        return "common.name";
    }
}
