package com.juzi.service;

import com.juzi.service.dependency.CallDependencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yzw on 2016/9/9 0009.
 */
@Service
public class HystrixService {
    @Autowired
    private CallDependencyService dependencyService;
    public String callDependencyService() {
        return dependencyService.callInfo();
    }
}
