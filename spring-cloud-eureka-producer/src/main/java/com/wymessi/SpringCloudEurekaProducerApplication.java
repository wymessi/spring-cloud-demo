package com.wymessi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaProducerApplication.class, args);
    }
}