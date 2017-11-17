package com.reborn.regist.dao;

import com.reborn.regist.domain.User;

/**
 * Created by Reborn。 on 2017/6/2.
 */
public interface IUserDao {
    User findByUsername(String username);
    int addUser(User user);
}
