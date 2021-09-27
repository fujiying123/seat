package com.xiaoying.seata.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoying.seata.entities.Udict;

/**
 * @Description：
 * @Date： 2021/9/26
 * @Author：小影
 */
public interface DeptService extends IService<Udict> {
    void insertDept();
}
