package com.dahua.seata.controller;

import com.alibaba.fastjson.JSONObject;
import com.dahua.seata.service.TmService;
import io.seata.spring.annotation.GlobalTransactional;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname TmController
 * @Description TODO
 * @Author 90673
 * @Date 2021/9/17
 */
@RestController
public class TmController {

    @Autowired
    private TmService tmServiceImpl;

    @PostMapping("/tm")
    @GlobalTransactional
            (rollbackFor = Exception.class)
    public void goods(Integer num) {
        tmServiceImpl.insert(num);
    }
}
