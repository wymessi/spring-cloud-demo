package com.wymessi.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerHelloController {

    private Logger logger = LogManager.getLogger(ProducerHelloController.class);

    @Value("${server.port}")
    private String port;  //服务消费方开启负载均衡后，该项目启动多个示例，可发现端口在多个示例运行的端口之间来回切换

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        logger.info("开始提供hello服务");
        return "hello " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/hello/zipkin")
    public String helloZipkin() {
        logger.info("开始提供helloZipkin服务");
        return "hello this is a test for zipkin";
    }
}
