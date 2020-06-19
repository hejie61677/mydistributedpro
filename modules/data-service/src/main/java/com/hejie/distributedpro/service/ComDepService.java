package com.hejie.distributedpro.service;

import com.hejie.distributedpro.pojo.ComDepartmentEntity;
import com.hejie.distributedpro.mapper.ComDepartmentMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Program: myroot
 * @Description: 机构相关服务类
 * @Author: hejie
 * @Create: 2020-06-12 17:14
 */
@Service
public class ComDepService {

    @Value("${server.port}")
    String port;

    @Resource
    ComDepartmentMapper comDepartmentMapper;

    public List<ComDepartmentEntity> selListCom() {
        List<ComDepartmentEntity> list = comDepartmentMapper.selList();
        for (ComDepartmentEntity comDepartmentEntity : list) {
            comDepartmentEntity.setDep_addr(comDepartmentEntity.getDep_addr() + ",端口:" + port);
        }
        return list;
    }

    public List<ComDepartmentEntity> selByPage(int start, int size) {
        size = start + size;
        List<ComDepartmentEntity> list = comDepartmentMapper.selByPage(start, size);
        for (ComDepartmentEntity comDepartmentEntity : list) {
            comDepartmentEntity.setDep_addr(comDepartmentEntity.getDep_addr() + ",端口:" + port);
        }
        return list;
    }

}
