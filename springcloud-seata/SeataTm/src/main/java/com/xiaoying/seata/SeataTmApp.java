package com.xiaoying.seata;

//import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description：
 * @Date： 2021/9/19
 * @Author：小影
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(basePackages = {"com.xiaoying.seata.mapper"})
//@EnableAutoDataSourceProxy
public class SeataTmApp {

    public static void main(String[] args) {
        SpringApplication.run(SeataTmApp.class,args);
    }
}
