package com.xiaoying.seata.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoying.seata.entities.Udict;
import com.xiaoying.seata.mapper.DeptMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description：
 * @Date： 2021/9/26
 * @Author：小影
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Udict> implements DeptService{

    @Transactional
    @Override
    public void insertDept() {
        Udict udict = new Udict();
        udict.setId(12l);
        udict.setValue("开始");
        udict.setStatus("bn");
        this.baseMapper.insert(udict);
    }
}
