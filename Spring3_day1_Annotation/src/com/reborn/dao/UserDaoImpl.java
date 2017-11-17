package com.reborn.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Reborn。 on 2017/6/13.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("dao hahaha");
    }
}
