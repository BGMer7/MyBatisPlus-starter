package com.gatsby.mybatisplus.service.impl;

import com.gatsby.mybatisplus.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author -- gatsby
 * @date -- 2022/6/29
 * @description --
 */


@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello";
    }
}