package com.reborn.service;

import com.reborn.dao.UserDao;

/**
 * Created by Reborn。 on 2017/6/11.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        userDao.save();
    }
}
