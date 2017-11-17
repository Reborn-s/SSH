package com.reborn.mapper;

import com.reborn.po.User;

import java.util.List;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public interface UserMapper
{
    User findUserById(int id);
    List<User> findUserByName(String name);
    void insertUser(User user);
}
