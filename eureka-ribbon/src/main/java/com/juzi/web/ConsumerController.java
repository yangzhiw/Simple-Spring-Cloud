package com.juzi.web;

import com.juzi.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yzw on 2016/8/24 0024.
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private SimpleService simpleService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
     //   return restTemplate.getForEntity("http://simple-SERVICE/add?a=10&b=20", String.class).getBody();
        return simpleService.addService();
    }

}
