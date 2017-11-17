package com.reborn.service;

/**
 * Created by Reborn。 on 2017/6/11.
 */
public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
        System.out.println("userService初始化了");
    }

    @Override
    public void addUser() {
        System.out.println("IoC add user...");
    }
}
