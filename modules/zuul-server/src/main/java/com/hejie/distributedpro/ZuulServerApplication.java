package com.hejie.distributedpro;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Program: myroot
 * @Description: zuul-server启动类
 * @Author: hejie
 * @Create: 2020-06-18 17:27
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ZuulServerApplication {
    public static void main(String[] args) {
        int port = 8010;
        if (!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d被占用了，无法启动%n", port );
            System.exit(1);
        }
        new SpringApplicationBuilder(ZuulServerApplication.class).properties("server.port=" + port).run(args);
    }
}
