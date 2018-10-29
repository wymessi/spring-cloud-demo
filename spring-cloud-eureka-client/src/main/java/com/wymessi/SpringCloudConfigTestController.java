package com.wymessi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangye
 * 测试服务从服务配置中心获取配置
 */
@RestController
public class SpringCloudConfigTestController {

    @Value("${name}")
    private String name;
    @RequestMapping(value = "/name")
    public String getName(){
        return name;
    }
}
