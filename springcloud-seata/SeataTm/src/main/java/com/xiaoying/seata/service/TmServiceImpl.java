package com.xiaoying.seata.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoying.seata.client.RmOneFeginClient;
import com.xiaoying.seata.client.RmTwoFeginClient;
import com.xiaoying.seata.entities.TmOrder;
import com.xiaoying.seata.mapper.TmMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Classname TmServiceImpl
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@Service
@Transactional
public class TmServiceImpl extends ServiceImpl<TmMapper, TmOrder> implements TmService {
    @Autowired
    private TmMapper tmMapper;

    @Autowired
    private RmOneFeginClient rmOneFeginClient;

    @Autowired
    private RmTwoFeginClient rmTwoFeginClient;

    @Override
    @GlobalTransactional
    public void insert(Integer num) {
        TmOrder order = new TmOrder();
        order.setTotalNum(num);
        this.baseMapper.insert(order);
//        this.tmMapper.insertOrder(order);
//        rmTwoFeginClient.money(num);
//        rmOneFeginClient.integral(num);
//        int i =10/0;
    }
}
