package com.reborn.service.UserServiceImpl;

import com.reborn.dao.UserDao;
import com.reborn.domain.User;
import com.reborn.service.UserService;

/**
 * Created by Reborn。 on 2017/6/17.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        userDao.save(user);
    }
}
