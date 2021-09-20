package com.xiaoying.seata.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoying.seata.entities.TmOrder;
import org.springframework.stereotype.Repository;

/**
 * @Classname TmMapper
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@Repository
public interface TmMapper extends BaseMapper<TmOrder> {

    void insertOrder(TmOrder order);
}
