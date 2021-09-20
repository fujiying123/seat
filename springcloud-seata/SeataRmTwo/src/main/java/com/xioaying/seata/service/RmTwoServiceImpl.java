package com.xioaying.seata.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xioaying.seata.entities.Money;
import com.xioaying.seata.mapper.RmTwoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Classname RmTwoServiceImpl
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@Service
public class RmTwoServiceImpl extends ServiceImpl<RmTwoMapper, Money> implements RmTwoService {
    @Override
    @Transactional
    public void insert(Integer num) {
        Money money = this.baseMapper.selectMById(1);
        money.setTotal(money.getTotal() - num);
        this.baseMapper.updateMById(money);

    }
}
