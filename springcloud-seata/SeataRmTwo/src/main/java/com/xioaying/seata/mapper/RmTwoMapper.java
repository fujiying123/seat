package com.xioaying.seata.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xioaying.seata.entities.Money;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname RmTwoMapper
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
public interface RmTwoMapper extends BaseMapper<Money> {
    Money selectMById(@Param("id") int id);

    void updateMById(Money money);
}
