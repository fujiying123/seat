package com.xiaoying.seata.entities;

import lombok.Data;

/**
 * @Description：
 * @Date： 2021/5/6
 * @Author：小影
 */
@Data
public class Course {

    private Long id;

    private String cname;

    private Long userId;

    private String status;
}
