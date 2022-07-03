package com.gatsby.mybatisplus.controller;

import com.gatsby.mybatisplus.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author -- gatsby
 * @date -- 2022/6/29
 * @description --
 */


@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    @Qualifier("helloServiceImpl")
    private HelloService helloService;

    // public HelloController(HelloService helloService) {
    //     this.helloService = helloService;
    // }

    @GetMapping("hello")
    public String hello() {
        return helloService.hello();
    }
}