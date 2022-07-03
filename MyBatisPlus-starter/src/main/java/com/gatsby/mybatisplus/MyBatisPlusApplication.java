package com.gatsby.mybatisplus;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@Slf4j
// @MapperScan(basePackages = {"com.gatsby.mybatisplus.mapper"})
// @ComponentScan(basePackages = {"com.gatsby.mybatisplus.config"})
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class MyBatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusApplication.class, args);
    }

    // 查看Bean是否被注入了
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            log.info("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            log.info(beanNames.length + " beans found.");
        };
    }
}
