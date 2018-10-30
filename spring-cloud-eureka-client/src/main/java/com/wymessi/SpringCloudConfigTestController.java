package com.wymessi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangye
 * 测试服务从服务配置中心获取配置
 *
 *
 * 实现功能：spring-cloud-bus 利用RabbitMQ实现配置文件更改后无需重启服务
 *
 * 踩坑记录
 * 1. 配置中心服务server和获取配置的client服务上都要配置 management.endpoints.web.exposure.include=bus-refresh
 *
 * 2. 在使用到配置文件中内容的类上添加注解 @RefreshScope
 *
 * 3. 访问http://localhost:port/actuator/bus-refresh刷新时，指定method为POST，contentType为application/json
 *
 * 4. 服务端与客户端都得加上spring-boot-starter-actuator依赖
 *
 *
 */
@RestController
@RefreshScope  //必须在使用配置文件的类上使用此注解，否则就算重新拉取了配置文件，也无法应用最新的内容
public class SpringCloudConfigTestController {

    @Value("${name}")
    private String name;
    @RequestMapping(value = "/name")
    public String getName(){
        return name;
    }
}
