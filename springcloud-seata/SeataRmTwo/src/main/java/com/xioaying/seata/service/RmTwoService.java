package com.xioaying.seata.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xioaying.seata.entities.Money;

/**
 * @Classname RmTwoService
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
public interface RmTwoService extends IService<Money> {
    void insert(Integer num);
}
