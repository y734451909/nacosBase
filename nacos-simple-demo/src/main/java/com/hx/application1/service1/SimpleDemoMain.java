package com.hx.application1.service1;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Properties;
import java.util.concurrent.Executor;

public class SimpleDemoMain {
    public static void main(String[] args) throws NacosException {
//        使用nacos client远程获取nacos服务上的配置信息
        //nacos server地址
        String serverAddr="127.0.0.1:8848";
        //data id
        String dataID="service1.yaml";
        //group
        String group="TEST_GROUP";
//        Namespace
        String namespace="06e5e761-9409-4f28-af65-1cc497aa3026";
        Properties properties = new Properties();
        properties.put("serverAddr",serverAddr);
        properties.put("namespace",namespace);
//        获取配置
        ConfigService configService = NacosFactory.createConfigService(properties);
        String config = configService.getConfig(dataID, group, 500);
        System.out.println(config);
        configService.addListener(dataID, group, new Listener() {
            @Override
            public Executor getExecutor() {
                return null;
            }
// 当配置文件发生变化时
            @Override
            public void receiveConfigInfo(String configInfo) {
                System.out.println(configInfo);
            }
        });
        while(true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
