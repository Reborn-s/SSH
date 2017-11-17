package com.reborn.BeanPostProcessor;

/**
 * Created by Reborn。 on 2017/6/11.
 */
public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
        System.out.println("UserService构造函数执行");
    }

    //初始化和销毁是在addUser执行前后执行，进行初始化或销毁
    public void myInit()
    {
        System.out.println("初始化");
    }

    public void myDestroy()
    {
        System.out.println("销毁");
    }
    @Override
    public void addUser() {
        System.out.println("service add user...");
    }
}
