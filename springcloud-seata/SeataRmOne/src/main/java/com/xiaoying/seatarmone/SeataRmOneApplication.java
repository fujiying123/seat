package com.xiaoying.seatarmone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(basePackages = {"com.xiaoying.seatarmone.mapper"})
public class SeataRmOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataRmOneApplication.class, args);
    }

}
