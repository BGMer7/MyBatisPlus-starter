package com.gatsby.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.gatsby.mybatisplus.entity.User;
import com.gatsby.mybatisplus.mapper.UserMapper;
import com.gatsby.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description --
 */


@DS("mybatisplus")
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUser() {
        return userMapper.selectList(null);
    }
}