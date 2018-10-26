package com.wymessi.service;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    private Logger logger = LogManager.getLogger(HelloService.class);

    public String helloService(String name) {
        logger.info("开始调用pring-cloud-eureka-producer提供的hello服务");
        return restTemplate.getForObject("http://spring-cloud-eureka-producer/hello?name="+name,String.class);
}

}
