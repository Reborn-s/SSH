package com.reborn.regist.dao.Impl;

import cn.itcast.jdbc.TxQueryRunner;
import com.reborn.regist.dao.IUserDao;
import com.reborn.regist.domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * Created by Reborn。 on 2017/6/2.
 */
public class UserDaoImpl implements IUserDao {
    private QueryRunner qr = new TxQueryRunner();

    @Override
    public User findByUsername(String username) {
        String sql = "select * from user where username=?";
        try {
            return qr.query(sql,new BeanHandler<User>(User.class),username);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into user values(?,?,?,?,?)";
        Object[] params = {user.getUsername(),user.getPassword(),user.getBirthday(),
                            user.getHobby(),user.isMarried()};
        try {
            return qr.update(sql,params);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
