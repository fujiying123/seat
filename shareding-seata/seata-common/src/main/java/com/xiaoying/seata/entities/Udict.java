package com.xiaoying.seata.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description：
 * @Date： 2021/5/11
 * @Author：小影
 */
@Data
@TableName(value = "t_udict")
public class Udict {

    private Long id;

    private String status;

    private String value;
}
