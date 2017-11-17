package com.reborn.web.action;

import com.reborn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Reborn。 on 2017/6/13.
 */

@Controller("userAction")
public class UserAction{

    @Autowired
    private UserService userService;

    public String execute()
    {
        userService.addUser();
        return "success";
    }
}
