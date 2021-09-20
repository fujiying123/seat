package com.xiaoying.seatarmone.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoying.seatarmone.entities.Integral;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname RmOneMapper
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
public interface RmOneMapper extends BaseMapper<Integral> {
    void insertInte(Integral total);
}
