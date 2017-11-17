package com.reborn.controller;

import com.reborn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by Reborn。 on 2017/8/10.
 */
@Controller
@RequestMapping("/user")
public class Restful
{
    @RequestMapping("/update/{id}")
    public String update(@PathVariable Integer id, Model model)
    {
        User user = new User();
        user.setId(id);
        user.setAddress("taipei");
        user.setUsername("hebe");
        user.setBirthday(new Date());
        model.addAttribute("user",user);
        return "edit";
    }
}
