package com.wymessi.service;

import org.springframework.stereotype.Component;

@Component
public class FeignHelloServiceHystrix implements FeignHelloService{

    @Override
    public String helloService(String name) {
        return String.format("hello %s, sorry, this is a error  Hystrix from Feign", name);
    }
}
