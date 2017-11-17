package com.reborn.jdbcDaoSupport;

import com.reborn.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class UserDao extends JdbcDaoSupport{

    public void insert(User user)
    {
        String sql = "insert into t_user(username, password) values(?,?)";
        Object[] pargs = {user.getUsername(),user.getPassword()};
        this.getJdbcTemplate().update(sql,pargs);
    }

    public List<User> findAll()
    {
        String sql = "select * from t_user";
        return this.getJdbcTemplate().query(sql, BeanPropertyRowMapper.newInstance(User.class));
    }

    public void update(User user)
    {
        String sql = "update t_user set username=?,password=? where id=?";
        Object[] args = {user.getUsername(),user.getPassword(),user.getId()};
        this.getJdbcTemplate().update(sql,args);
    }
}
