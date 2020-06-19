package com.hejie.distributedpro.service;

import com.hejie.distributedpro.client.ComDepRibbonClient;
import com.hejie.distributedpro.pojo.ComDepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program: myroot
 * @Description: 机构相关服务类
 * @Author: hejie
 * @Create: 2020-06-16 10:45
 */
@Service
public class ComDepService {

    @Autowired
    ComDepRibbonClient ribbonClient;

    public List<ComDepartmentEntity> selDepList() {
        return ribbonClient.selDepList();
    }

    public List<ComDepartmentEntity> selDepByPage(int start, int size) {
        return ribbonClient.selDepByPage(start, size);
    }
}
