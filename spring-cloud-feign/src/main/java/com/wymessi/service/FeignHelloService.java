package com.wymessi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-eureka-producer")
public interface FeignHelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String helloService(@RequestParam("name") String name);

}
