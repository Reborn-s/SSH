package com.reborn.regist.service.Impl;

import com.reborn.regist.dao.DaoFactory;
import com.reborn.regist.dao.IUserDao;
import com.reborn.regist.domain.User;
import com.reborn.regist.service.IUserService;

/**
 * Created by Reborn。 on 2017/6/2.
 */
public class UserServiceImpl implements IUserService{
    private IUserDao userDao = DaoFactory.getDao();
    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public int regist(User user) {
        return userDao.addUser(user);
    }
}
