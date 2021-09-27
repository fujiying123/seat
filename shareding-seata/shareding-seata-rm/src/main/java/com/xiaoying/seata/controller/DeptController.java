package com.xiaoying.seata.controller;

import com.xiaoying.seata.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @Date： 2021/9/26
 * @Author：小影
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptServiceImpl;

    @PostMapping("/addDept")
    public void addDept() {
        deptServiceImpl.insertDept();
    }
}
