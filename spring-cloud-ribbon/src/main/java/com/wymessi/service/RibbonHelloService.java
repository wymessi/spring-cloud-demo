package com.wymessi.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonHelloService {

    @Autowired
    private RestTemplate restTemplate;

    private Logger logger = LogManager.getLogger(RibbonHelloService.class);

    @HystrixCommand(fallbackMethod = "helloError") //对方法创建熔断机制功能，并制定熔断方法
    public String helloService(String name) {
        logger.info("开始调用pring-cloud-eureka-producer提供的hello服务");
        return restTemplate.getForObject("http://spring-cloud-eureka-producer/hello?name="+name,String.class);
}
    public String helloError(String name) {
        logger.error("服务不可用，熔断机制生效");
        return String.format("hello %s, sorry, this is a error", name);
    }
}
