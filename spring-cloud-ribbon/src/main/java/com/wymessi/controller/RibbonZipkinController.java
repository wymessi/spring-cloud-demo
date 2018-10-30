package com.wymessi.controller;

import com.wymessi.service.RibbonHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonZipkinController {

    @GetMapping(value = "hello/zipkin/name")
    public String helloZipkin() {
        return "this is a name";
    }
}
