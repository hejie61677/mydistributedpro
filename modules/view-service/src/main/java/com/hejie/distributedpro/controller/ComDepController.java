package com.hejie.distributedpro.controller;

import com.hejie.distributedpro.pojo.ComDepartmentEntity;
import com.hejie.distributedpro.service.ComDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Program: myroot
 * @Description: 机构相关控制器
 * @Author: hejie
 * @Create: 2020-06-16 10:55
 */
@Controller
public class ComDepController {

    @Autowired
    ComDepService comDepService;

    @RequestMapping("/depInfo")
    public String findDepHtml() {
        return "depInfo";
    }

    @RequestMapping("/depList")
    @ResponseBody
    public List<ComDepartmentEntity> selDepList() {
        return comDepService.selDepList();
    }

    @GetMapping("/depList/{start}/{size}")
    @ResponseBody
    public List<ComDepartmentEntity> selDepByPage(@PathVariable("start") int start, @PathVariable("size") int size) {
        return comDepService.selDepByPage(start, size);
    }

}
