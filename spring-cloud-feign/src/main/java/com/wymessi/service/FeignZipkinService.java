package com.wymessi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-ribbon")
public interface FeignZipkinService {

    @RequestMapping(value = "hello/zipkin/name", method = RequestMethod.GET)
    String helloZipkin();
}
