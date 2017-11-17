package com.reborn.controller;

import com.reborn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Reborn。 on 2017/10/16.
 */
@Controller
@RequestMapping("multiview")
public class MultiviewController {

    @RequestMapping("multiview")
    public User multiview()
    {
        User user = new User();
        user.setUsername("Selina");
        user.setAddress("台北");
        user.setSex("female");
        System.out.println(user);
        return user;
    }
}
