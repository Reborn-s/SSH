package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.reborn.domain.User;
import com.reborn.service.UserService;

/**
 * Created by Reborn。 on 2017/6/17.
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User getModel() {
        return user;
    }

    public String register()
    {
        userService.register(user);
        return SUCCESS;
    }
}
