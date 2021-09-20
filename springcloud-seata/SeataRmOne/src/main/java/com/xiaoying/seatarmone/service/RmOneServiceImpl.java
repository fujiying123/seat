package com.xiaoying.seatarmone.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoying.seatarmone.entities.Integral;
import com.xiaoying.seatarmone.mapper.RmOneMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Classname RmOneServiceImpl
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@Service
public class RmOneServiceImpl extends ServiceImpl<RmOneMapper, Integral> implements RmOneService {
    @Override
    @Transactional
    public void insert(Integer integral) {
        Integral in = new Integral();
        in.setTotal(integral);
        this.baseMapper.insertInte(in);
//        int i =10/0;
    }
}
