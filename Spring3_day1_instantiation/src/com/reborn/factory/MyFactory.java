package com.reborn.factory;

/**
 * Created by Reborn。 on 2017/6/11.
 */
public class MyFactory {
    public UserService createUserService()
    {
        return new UserServiceImpl();
    }
}
