package com.reborn.other;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Reborn。 on 2017/6/13.
 */
@Service("userService")
//@Scope("prototype")
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("service hahaha");
    }

    @PostConstruct
    public void myInit()
    {
        System.out.println("init...");
    }

    @PreDestroy
    public void myDestroy()
    {
        System.out.println("destroy...");
    }
}
