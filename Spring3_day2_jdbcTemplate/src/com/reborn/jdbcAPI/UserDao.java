package com.reborn.jdbcAPI;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class UserDao {
    public static void main(String[] args) {
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/hibernate";
        String username = "root";
        String password = "p123";

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);

        String sql = "insert into t_user(username, password) values(?,?)";
        Object[] pargs = {"青峰","330"};
        jdbcTemplate.update(sql,pargs);
    }
}
