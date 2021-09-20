package com.xioaying.seata.controller;

import com.xioaying.seata.service.RmTwoService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname RmController
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@RestController
public class RmController {

    @Autowired
    private RmTwoService rmTwoServiceImpl;

    @PostMapping("/money")
    public void money(@RequestBody Integer num) {
        rmTwoServiceImpl.insert(num);
    }
}
