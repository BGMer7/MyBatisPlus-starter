package com.gatsby.redisstarter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author -- gatsby
 * @date -- 2022/6/15
 * @description --
 * spring中为redis定义了专门的RedisAutoConfiguration自动配置类
 * 这个类在 package org.springframework.boot.autoconfigure.data.redis 中
 * 其中定义创建泛型为<Object, Object>的RedisTemplate对象。
 * 为了允许自定义配置Bean，自动配置类使用@ConditionalOnMissingBean注解，
 * 表示当其他地方定义一个RedisTemplate的Bean时，会替代自动配置中的结果。
 */


// 自定义RedisConfig
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Serializable> redisTemplate(LettuceConnectionFactory lettuceConnectionFactory) {
        RedisTemplate<String, Serializable> redisTemplate = new RedisTemplate<>();
        // StringRedisSerializer：序列化为String
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // GenericJackson2JsonRedisSerializer：
        // 序列化为JSON,同时在json中加入@class属性，类的全路径包名，方便反系列化
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
        //设置连接工厂
        redisTemplate.setConnectionFactory(lettuceConnectionFactory);
        return redisTemplate;
    }
}
