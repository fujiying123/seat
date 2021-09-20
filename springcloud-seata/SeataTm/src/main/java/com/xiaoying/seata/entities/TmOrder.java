package com.xiaoying.seata.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Classname Order
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TmOrder {

    @TableId(type = IdType.AUTO)
    private Long id;

    private Integer totalNum;

    private Date createTime;

    private Date updateTime;
}
