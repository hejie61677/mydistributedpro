package com.hejie.distributedpro.client;

import com.hejie.distributedpro.pojo.ComDepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Program: myroot
 * @Description: 基于Ribbon访问微服务,客户端负载均衡
 * @Author: hejie
 * @Create: 2020-06-16 10:28
 */
@Component
public class ComDepRibbonClient {

    @Autowired
    RestTemplate restTemplate;

    public List<ComDepartmentEntity> selDepList() {
        return restTemplate.getForObject("http://DATA-SERVICE/comDepList", List.class);
    }

    public List<ComDepartmentEntity> selDepByPage(int start, int size) {
        return restTemplate.getForObject("http://DATA-SERVICE/depList/"+start+"/" +size, List.class);
    }

}
