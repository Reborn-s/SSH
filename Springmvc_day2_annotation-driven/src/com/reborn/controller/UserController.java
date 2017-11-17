package com.reborn.controller;

import com.reborn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Reborn。 on 2017/10/16.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("multiview")
    public User multiview()
    {
        User user = new User();
        user.setAddress("台北");
        user.setUsername("喜碧");
        System.out.println(user);
        return user;
    }
}
