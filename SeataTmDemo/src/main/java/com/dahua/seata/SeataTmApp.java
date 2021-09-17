package com.dahua.seata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Classname SeataTmApp
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(basePackages = {"com.dahua.seata.mapper"})
public class SeataTmApp {

    public static void main(String[] args) {
        SpringApplication.run(SeataTmApp.class,args);
    }
}
