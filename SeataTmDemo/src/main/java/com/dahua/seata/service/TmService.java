package com.dahua.seata.service;

import com.baomidou.mybatisplus.service.IService;
import com.dahua.seata.entities.TmOrder;

/**
 * @Classname TmService
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
public interface TmService extends IService<TmOrder> {
    void insert(Integer num);
}
