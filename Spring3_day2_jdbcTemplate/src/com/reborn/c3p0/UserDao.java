package com.reborn.c3p0;

import com.reborn.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class UserDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(User user)
    {
        String sql = "insert into t_user(username, password) values(?,?)";
        Object[] pargs = {user.getUsername(),user.getPassword()};
        jdbcTemplate.update(sql,pargs);
    }

    public List<User> findAll()
    {
        String sql = "select * from t_user";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(User.class));
    }

    public void update(User user)
    {
        String sql = "update t_user set username=?,password=? where id=?";
        Object[] args = {user.getUsername(),user.getPassword(),user.getId()};
        jdbcTemplate.update(sql,args);
    }

}
