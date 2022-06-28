package com.gatsby.mybatisplus.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description -- 数据库java_mysql的连接配置类
 */


@Configuration
@MapperScan(basePackages = {DruidJavaConfig.PACKAGE}, sqlSessionFactoryRef = "sqlSessionFactory")
public class DruidJavaConfig {
    static final String PACKAGE = "com.gatsby.mybatisplus";
    static final String MAPPER_LOCATION = "classpath:mapper/*.xml";


    @Bean("dbJava")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.java")
    public DataSource dbJava() {
        return new DruidDataSource();
    }

    @Bean("sqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dbJava")DataSource dbJava) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dbJava);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(DruidJavaConfig.MAPPER_LOCATION));
        return sqlSessionFactoryBean.getObject();

    }

}