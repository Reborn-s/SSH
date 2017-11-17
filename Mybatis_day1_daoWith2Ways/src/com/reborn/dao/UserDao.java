package com.reborn.dao;

import com.reborn.po.User;

import java.util.List;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public interface UserDao
{
    public User findUserById(int id);
    public List<User> findUserByName(String username);
    public void insetUser(User user);
}
