package com.gatsby.redisstarter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

@SpringBootApplication
@MapperScan("com.gatsby.redisstarter.mapper")
public class RedisStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisStarterApplication.class, args);
    }

}
