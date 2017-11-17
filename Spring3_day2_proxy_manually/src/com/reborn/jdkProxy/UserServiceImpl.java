package com.reborn.jdkProxy;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("service添加用户啦");
    }
}
