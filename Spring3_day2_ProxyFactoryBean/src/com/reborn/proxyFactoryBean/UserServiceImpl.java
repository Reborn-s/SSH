package com.reborn.proxyFactoryBean;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("service添加用户啦");
    }

    @Override
    public void updateUser() {
        System.out.println("service更新用户啦");
    }

    @Override
    public void deleteUser() {
        System.out.println("service删除用户啦");
    }
}
