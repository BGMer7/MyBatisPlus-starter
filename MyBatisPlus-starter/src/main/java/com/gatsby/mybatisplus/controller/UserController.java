package com.gatsby.mybatisplus.controller;

import com.gatsby.mybatisplus.entity.User;
import com.gatsby.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description --
 */


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    public UserController(UserService userService) {
        this.userService  = userService;
    }

    @GetMapping("/query-all-user")
    public List<User> queryAllUser() {
        return userService.queryAllUser();
    }
}