package com.hejie.distributedpro;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.NetUtil;
import cn.hutool.core.util.NumberUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @Program: myroot
 * @Description: data-service启动类
 * @Author: hejie
 * @Create: 2020-06-16 08:50
 */
@SpringBootApplication
@EnableEurekaClient
public class DataServiceApplication {

    public static void main(String[] args) {
        int port;
        int defaultPort = 8001;
        Future<Integer> future = ThreadUtil.execAsync(() ->{
            int realPort;
            System.out.println("请于5秒钟内输入端口号, 推荐<8001>,<8002>或<8003>,超过5秒将默认使用 " + defaultPort);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String inputPort = scanner.nextLine();
                if (!NumberUtil.isInteger(inputPort)) {
                    System.err.println("只能输入数字");
                } else {
                    realPort = Convert.toInt(inputPort);
                    scanner.close();
                    break;
                }
            }
            return realPort;
        });

        try {
            port = future.get(5, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            port = defaultPort;
        }

        if (!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d被占用了，无法启动%n", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(DataServiceApplication.class).properties("server.port=" + port).run(args);
    }
}
