package com.xiaoying.seata.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description：
 * @Date： 2021/5/9
 * @Author：小影
 */
@Data
@TableName(value = "t_user")
public class User {


    private Long id;

    private String userName;

    private String status;
}
