package com.czj.utils;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbUtils {
    private static DruidDataSource dataSource;

    public static void main(String[] args) {
        System.out.println(dataSource);
    }
    static {
        try {
            Properties properties=new Properties();
            InputStream is=DbUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(is);
            dataSource=new DruidDataSource();
            dataSource.setUsername(properties.getProperty("jdbc.username"));
            dataSource.setPassword(properties.getProperty("jdbc.password"));
            dataSource.setUrl(properties.getProperty("jdbc.url"));
            dataSource.setDriverClassName(properties.getProperty("jdbc.driverClassName"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource(){
        return dataSource;
    }
}
