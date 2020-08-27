package com.hejie.distributedpro.controller;

import com.hejie.distributedpro.service.ComDepService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Program: myroot
 * @Description: 机构相关控制器
 * @Author: hejie
 * @Create: 2020-06-16 08:43
 */
@Controller
public class ComDepController {

    @Resource
    ComDepService comDepService;

    @ResponseBody
    @RequestMapping("/comDepList")
    public Object selComDep() {
        return comDepService.selListCom();
    }

    @ResponseBody
    @GetMapping("/depList/{start}/{size}")
    public Object selByPage(@PathVariable("start") int start, @PathVariable("size") int size) {
        return comDepService.selByPage(start, size);
    }
}
