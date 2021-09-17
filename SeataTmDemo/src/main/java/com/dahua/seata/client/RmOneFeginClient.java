package com.dahua.seata.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Classname FeginClient
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@FeignClient(name="seata-rm1")
public interface RmOneFeginClient {
    @PostMapping("/integral")
    public void integral(@RequestBody Integer integral);
}
