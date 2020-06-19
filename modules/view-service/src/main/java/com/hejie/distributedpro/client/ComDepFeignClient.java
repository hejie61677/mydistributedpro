package com.hejie.distributedpro.client;

import com.hejie.distributedpro.pojo.ComDepartmentEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Program: myroot
 * @Description: 基于Feign访问微服务,封装Ribbon,采用注解方式
 * @Author: hejie
 * @Create: 2020-06-16 10:28
 */
@FeignClient(value = "DATA-SERVICE")
public interface ComDepFeignClient {

    @GetMapping(value = "/comDepList")
    List<ComDepartmentEntity> selDepList();

    @GetMapping("/depList/{start}/{size}")
    List<ComDepartmentEntity> selDepByPage(@PathVariable("start") int start, @PathVariable("size") int size);

}
