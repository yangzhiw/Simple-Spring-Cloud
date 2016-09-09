package com.juzi.web;

import com.juzi.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yzw on 2016/9/9 0009.
 * 模拟对外的接口
 */
@RestController
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @RequestMapping("/test")
    public String call() {
        return  hystrixService.callDependencyService();
    }
}
