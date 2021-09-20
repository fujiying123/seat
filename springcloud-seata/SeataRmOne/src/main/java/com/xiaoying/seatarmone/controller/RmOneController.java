package com.xiaoying.seatarmone.controller;


import com.xiaoying.seatarmone.service.RmOneService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname RmOneController
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@RestController
public class RmOneController {

    @Autowired
    private RmOneService rmOneServiceImpl;

    @PostMapping("/integral")
    public void integral(@RequestBody Integer integral) {
        rmOneServiceImpl.insert(integral);
    }
}
