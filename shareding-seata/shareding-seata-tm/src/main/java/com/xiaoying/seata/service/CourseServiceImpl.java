package com.xiaoying.seata.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoying.seata.client.FeginClient;
import com.xiaoying.seata.entities.Course;
import com.xiaoying.seata.mapper.CourseMapper;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description：
 * @Date： 2021/9/26
 * @Author：小影
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService{

    @Autowired
    private FeginClient feginClient;

    @Transactional
    @Override
    @ShardingTransactionType(TransactionType.BASE)
    public void addCourse() {
        Course course = new Course();
        course.setCname("shardingseata");
        course.setUserId(221l);
        course.setStatus("Normal");
        this.baseMapper.insert(course);
        feginClient.addDept();
        int i=10/0;
    }
}
