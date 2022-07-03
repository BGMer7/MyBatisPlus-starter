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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description -- 数据库mybatis_plus的连接配置类
 */


@Slf4j
@Configuration
@MapperScan(basePackages = DruidMbpConfig.PACKAGE, sqlSessionFactoryRef = "sqlSessionFactoryMbp")
public class DruidMbpConfig {
    static final String PACKAGE = "com.gatsby.mybatisplus.mapper";
    static final String MAPPER_LOCATION = "classpath:mapper/*.xml";


    @Bean("dbMbp")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.mybatisplus")
    public DataSource druidDataSource() {
        log.info("初始化mybatis_plus数据源");
        return DruidDataSourceBuilder.create().build();
    }

    @Bean("sqlSessionFactoryMbp")
    @Primary
    public SqlSessionFactory sqlSessionFactoryMbp(@Qualifier("dbMbp")DataSource dbMbp) throws Exception {
        log.info("创建mybatis_plus数据源的sqlSessionFactory");
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dbMbp);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(DruidMbpConfig.MAPPER_LOCATION));
        return sqlSessionFactoryBean.getObject();
    }

}