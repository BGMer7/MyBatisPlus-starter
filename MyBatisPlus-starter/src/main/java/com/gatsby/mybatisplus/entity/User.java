package com.gatsby.mybatisplus.entity;

import lombok.Data;

/**
 * @author -- gatsby
 * @date -- 2022/2/23
 * @description --
 */
@Data
public class User {
    private Long id;
    private String name;
    private int age;
    private String email;
}