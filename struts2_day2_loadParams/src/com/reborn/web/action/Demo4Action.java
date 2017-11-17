package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.reborn.domain.User;

/**
 * Created by Reborn。 on 2017/6/2.
 * 使用模型驱动动态加载参数
 */
public class Demo4Action extends ActionSupport implements ModelDriven<User> {
    private User user=  new User();
    @Override
    public User getModel() {
        return user;
    }

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
