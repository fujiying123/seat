package com.xiaoying.seata.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Classname FeginClient
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@FeignClient(name="seata-rmtwo")
public interface RmTwoFeginClient {

    @PostMapping("/money")
    public void money(@RequestBody Integer money);
}
