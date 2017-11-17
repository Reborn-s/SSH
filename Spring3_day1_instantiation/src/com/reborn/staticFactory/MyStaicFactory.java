package com.reborn.staticFactory;

/**
 * Created by Reborn。 on 2017/6/11.
 */
public class MyStaicFactory {
    public static UserService createUserService()
    {
        return new UserServiceImpl();
    }
}
