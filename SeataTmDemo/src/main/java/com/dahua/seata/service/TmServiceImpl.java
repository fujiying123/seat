package com.dahua.seata.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dahua.seata.client.RmOneFeginClient;
import com.dahua.seata.client.RmTwoFeginClient;
import com.dahua.seata.entities.TmOrder;
import com.dahua.seata.mapper.TmMapper;
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
    public void insert(Integer num) {
        TmOrder order = new TmOrder();
        order.setTotalNum(num);
        this.tmMapper.insert(order);
        rmTwoFeginClient.money(num);
        rmOneFeginClient.integral(num);
    }
}
