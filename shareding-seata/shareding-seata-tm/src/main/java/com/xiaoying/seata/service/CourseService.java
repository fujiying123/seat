package com.xiaoying.seata.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoying.seata.entities.Course;

/**
 * @Description：
 * @Date： 2021/9/26
 * @Author：小影
 */
public interface CourseService extends IService<Course> {
    void addCourse();
}
