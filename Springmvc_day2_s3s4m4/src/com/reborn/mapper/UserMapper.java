package com.reborn.mapper;

import com.reborn.pojo.User;

import java.util.List;

/**
 * Created by Reborn。 on 2017/10/17.
 */
public interface UserMapper {
    int countUser(User user);
    void deleteUser(User user);
    void deleteByPrimaryKey(Integer id);
    void insertUser(User user);
    List<User> selectUsers(User user);
    User selectUserById(Integer id);
    void updateUserByPrimaryKey(User user);
    void updateUserByPrimaryKeySelective(User user);
}
