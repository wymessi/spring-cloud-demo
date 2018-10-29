package com.wymessi.controller;

import com.wymessi.service.FeignHelloService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHelloController {

    private Logger logger = LogManager.getLogger(FeignHelloController.class);

    @Autowired
    private FeignHelloService helloService;

    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        logger.info("开始调用pring-cloud-eureka-producer提供的hello服务");
        return helloService.helloService(name);
    }
}
