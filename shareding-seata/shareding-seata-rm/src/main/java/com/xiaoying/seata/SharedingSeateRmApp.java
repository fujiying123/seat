package com.xiaoying.seata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description：
 * @Date： 2021/9/25
 * @Author：小影
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.xiaoying.seata.mapper"})
public class SharedingSeateRmApp {
    public static void main(String[] args) {
        SpringApplication.run(SharedingSeateRmApp.class,args);
    }
}
