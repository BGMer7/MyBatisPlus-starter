package com.gatsby.mybatisplus.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
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
 * @description -- 数据库mybatis_plus的连接配置类
 */


@Configuration
@MapperScan(basePackages = DruidMbpConfig.PACKAGE, sqlSessionFactoryRef = "sqlSessionFactoryMbp")
public class DruidMbpConfig {
    static final String PACKAGE = "com.gatsby.mybatisplus.*";
    static final String MAPPER_LOCATION = "classpath:mapper/*.xml";


    @Bean("dbMbp")
    @ConfigurationProperties(prefix = "spring.datasource.mybatisplus")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }

    @Bean("sqlSessionFactoryMbp")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dbMbp")DataSource dbMbp) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dbMbp);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(DruidMbpConfig.MAPPER_LOCATION));
        return sqlSessionFactoryBean.getObject();

    }

}