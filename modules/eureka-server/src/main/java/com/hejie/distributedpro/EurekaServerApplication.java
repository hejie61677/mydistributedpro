package com.hejie.distributedpro;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Program: distributedpro
 * @Description: 启动类
 * @Author: hejie
 * @Create: 2020-06-12 15:24
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        int port = 8761;
        if(!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d被占用了，无法启动%n", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(EurekaServerApplication.class).properties("server.port=" + port).run(args);
    }
}
