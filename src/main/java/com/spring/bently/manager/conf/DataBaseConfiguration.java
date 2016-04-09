/*
 * Create Author  : yong.zou
 * Create Date    : 2016-04-09
 * Project        : bently
 * File Name      : DataBaseConfiguration.java
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */
package com.spring.bently.manager.conf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

/**
 * 功能描述:  <p>
 *
 * @author : yong.zou <p>
 * @version 1.0 2016-04-09
 * @since bently 1.0
 */
@Configuration
@EnableWebMvc
@EnableTransactionManagement
public class DataBaseConfiguration implements EnvironmentAware {

    private static final String url = "jdbc:mysql://182.61.5.242:3306/bentley?useUnicode=true&characterEncoding=utf-8";

    private static final String driverClass = "com.mysql.jdbc.Driver";

    private static final String username = "root";

    private static final String password = "Jtd@2016";

    @Override
    public void setEnvironment(Environment environment) {

    }

    @Bean(name="dataSource", destroyMethod = "close", initMethod="init")
    @Primary
    public DataSource writeDataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(url);
        datasource.setDriverClassName(driverClass);
        datasource.setUsername(username);
        datasource.setPassword(password);
        return datasource;
    }
}
