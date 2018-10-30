package com.wymessi.controller;

import com.wymessi.service.FeignHelloService;
import com.wymessi.service.FeignZipkinService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignZipkinController {

    private Logger logger = LogManager.getLogger(FeignZipkinController.class);

    @Autowired
    private FeignZipkinService zipkinService;

    @GetMapping(value = "hello/zipkin")
    public String helloZipkin() {
        logger.info("开始调用pring-cloud-ribbon提供的helloZipkin服务");
        return zipkinService.helloZipkin();
    }

}
