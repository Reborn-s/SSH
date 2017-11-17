package com.reborn.controller;

import com.reborn.pojo.User;
import com.reborn.pojo.UserCustom;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Reborn。 on 2017/8/10.
 */
@Controller
@RequestMapping("/user")
public class ReceiveParameter
{
    @RequestMapping("/receiveInt")
    public String receiveInt(Integer id)
    {
        System.out.println(id);
        return "index";
    }

    @RequestMapping("/receiveStr")
    public String receiveStr(String username)
    {
        System.out.println(username);
        return "index";
    }

    @RequestMapping("/receiveArray")
    public String receiveArray(Integer[] ids)
    {
        for(Integer i:ids)
            System.out.println(i);
        return "index";
    }

    @RequestMapping("/receiveUser")
    public String receiveUser(User user)
    {
        System.out.println(user);
        return "index";
    }

    @RequestMapping("receiveUserCustom")
    public String receiveUserCustom(UserCustom userCustom)
    {
        System.out.println(userCustom);
        return "index";
    }

    @RequestMapping("receiveList")
    public String receiveList(UserCustom userCustom)
    {
        System.out.println(userCustom);
        return "index";
    }

    @RequestMapping("receiveMap")
    public String receiveMap(UserCustom userCustom)
    {
        System.out.println(userCustom);
        return "index";
    }


}
