package com.juzi.service.dependency;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by yzw on 2016/9/9 0009.
 */

@Component
public class CallDependencyService {
    private Random random = new Random();
    @HystrixCommand(fallbackMethod = "fallback")
    public String callInfo(){
        int randomInt= random.nextInt(10) ;
        if(randomInt<5){  //模拟调用失败情况
            throw new RuntimeException("call dependency service fail.");
        }else{
            return "success! number is :"+randomInt;
        }
    }

    public String fallback(){
        return "call dependency service fail.";
    }
}
