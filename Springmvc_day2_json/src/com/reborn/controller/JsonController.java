package com.reborn.controller;

import com.reborn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Reborn。 on 2017/10/15.
 * RequestBody接受前台json数据，并把json数据自动转为javaBean
 * ResponseBody把后台pojo转换为json对象，返回给页面
 */

@Controller
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("toJson")
    public String toJson()
    {
        return "json";
    }

    @RequestMapping("requestJson")
    public @ResponseBody User requestJson(@RequestBody User user)
    {
        System.out.println(user);
        return user;
    }

    @RequestMapping("requestPojo")
    public @ResponseBody User requestPojo(User user)
    {
        System.out.println(user);
        return user;
    }
}
