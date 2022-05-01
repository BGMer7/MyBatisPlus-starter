package com.gatsby.mybatisstarter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gatsby.mybatisstarter.mapper")
public class MyBatisStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisStarterApplication.class, args);
    }

}
