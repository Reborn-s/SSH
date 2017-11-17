package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.reborn.domain.User;

/**
 * Created by Reborn。 on 2017/6/2.
 * 与domain耦合起来动态装载参数,表单里面也要使用domain
 */
public class Demo3Action extends ActionSupport {
    private User user;

    public String addUser()
    {
        System.out.println(user.getUsername() + ", " + user.getPassword());
        return NONE;
    }

    public User getUser() {
        System.out.println("getUser");
        return user;
    }

    public void setUser(User user) {
        System.out.println("setUser");
        this.user = user;
    }
}
