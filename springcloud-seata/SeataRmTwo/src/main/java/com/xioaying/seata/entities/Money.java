package com.xioaying.seata.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Classname Money
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@Data
public class Money {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Integer total;
}
