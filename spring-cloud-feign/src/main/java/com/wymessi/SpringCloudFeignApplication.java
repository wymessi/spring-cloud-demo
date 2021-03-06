package com.wymessi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //向服务中心注册
@EnableFeignClients //启用Feign
public class SpringCloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignApplication.class, args);
    }
}
