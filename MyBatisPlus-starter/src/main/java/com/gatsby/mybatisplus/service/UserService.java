package com.gatsby.mybatisplus.service;

import com.gatsby.mybatisplus.entity.User;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description --
 */


public interface UserService {
    List<User> queryAllUser();
}