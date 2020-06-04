package com.hx.application1.service1;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootTest
public class Service1BootstrapTests {
    @Autowired
    ConfigurableApplicationContext applicationContext;
    public String config1;
    @Test
    void prt()
    {
        System.out.println("Just Test!");
       String string= getConfigs();
        System.out.println(string);
//        @GetMapping("/test");

    }
    @GetMapping("/test")
    public String getConfigs(){
//        读取配置信息
        System.out.println("读取配置信息");

        String name=applicationContext.getEnvironment().getProperty("common.name");
        String age=applicationContext.getEnvironment().getProperty("common.age");
        String address=applicationContext.getEnvironment().getProperty("common.address");
        String birthday=applicationContext.getEnvironment().getProperty("common.birthday");
        String fullname=applicationContext.getEnvironment().getProperty("common.fullname");
        return name+"->"+age+"->"+address+"->"+birthday+"->"+fullname;
    }
}
