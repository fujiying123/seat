package com.xiaoying.seatarmone.entities;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @Classname Money
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@Data
public class Integral implements Serializable {
    private static final long serialVersionUID = -3766164212066342578L;
    @TableId(type = IdType.AUTO)
    private Long id;

    private Integer total;
}
