package com.reborn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Reborn。 on 2017/10/20.
 */
@Controller
@RequestMapping("ftl")
public class HelloController {

    @RequestMapping("hello")
    public String hello(Model model)
    {
        model.addAttribute("hello","freemarker页面静态化");
        return "hello";

    }
}
