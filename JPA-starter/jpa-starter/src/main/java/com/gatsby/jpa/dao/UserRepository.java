package com.gatsby.jpa.dao;

import com.gatsby.jpa.entity.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @classname UserRepository
 * @description:
 * @author: bgm
 * @create: 2022/9/23
 **/

public interface UserRepository extends JpaRepository<User, Integer> {
}
