package com.xiaoying.seata.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Description：
 * @Date： 2021/9/26
 * @Author：小影
 */
@FeignClient("sharding-seata-rm")
public interface FeginClient {

    @PostMapping("/addDept")
    public void addDept();
}
