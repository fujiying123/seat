package com.xiaoying.seata.controller;

import com.xiaoying.seata.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @Date： 2021/9/26
 * @Author：小影
 */
@RestController
public class CourseController {
    @Autowired
    private CourseService courseServiceImpl;

    @PostMapping("/addCourse")
    public void addCourse() {
        courseServiceImpl.addCourse();
    }

}
