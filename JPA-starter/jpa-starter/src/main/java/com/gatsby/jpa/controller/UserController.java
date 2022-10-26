package com.gatsby.jpa.controller;

import com.gatsby.jpa.common.ServerResponse;
import com.gatsby.jpa.common.ServerResponseUtils;
import com.gatsby.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname UserController
 * @description:
 * @author: bgm
 * @create: 2022/9/23
 **/


@RestController
@RequestMapping(value = "/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ServerResponse selectAll() {
        return ServerResponseUtils.success(userService.selectAll());
    }
}
