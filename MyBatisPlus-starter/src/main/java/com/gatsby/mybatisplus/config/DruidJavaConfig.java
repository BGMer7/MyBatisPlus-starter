package com.gatsby.mybatisplus.config;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description -- 数据库java_mysql的连接配置类
 */

@Slf4j
@Configuration
@MapperScan(basePackages = {DruidJavaConfig.PACKAGE}, sqlSessionFactoryRef = "sqlSessionFactoryJava")
public class DruidJavaConfig {
    static final String PACKAGE = "com.gatsby.mybatisplus.mapper";
    static final String MAPPER_LOCATION = "classpath:mapper/*.xml";


    @Bean("dbJava")
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.java")
    public DataSource dbJava() {
        log.info("初始化java_mysql数据源");
        return DruidDataSourceBuilder.create().build();
    }

    @Bean("sqlSessionFactoryJava")
    public SqlSessionFactory sqlSessionFactoryJava(@Qualifier("dbJava")DataSource dbJava) throws Exception {
        log.info("创建java_mysql数据源的sqlSessionFactory");
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dbJava);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(DruidJavaConfig.MAPPER_LOCATION));
        return sqlSessionFactoryBean.getObject();
    }
}