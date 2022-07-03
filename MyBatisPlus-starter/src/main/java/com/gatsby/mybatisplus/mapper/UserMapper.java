package com.gatsby.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gatsby.mybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * @author -- gatsby
 * @date -- 2022/2/23
 * @description --
 */

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}