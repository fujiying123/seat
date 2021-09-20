package com.xiaoying.seatarmone.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoying.seatarmone.entities.Integral;

/**
 * @Classname RmOneService
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
public interface RmOneService extends IService<Integral> {
    void insert(Integer integral);
}
