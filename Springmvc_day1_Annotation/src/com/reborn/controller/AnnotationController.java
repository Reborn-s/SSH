package com.reborn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 注解Controller
 * Created by Reborn。 on 2017/8/10.
 */

@Controller
@RequestMapping("/user")
public class AnnotationController
{
    @RequestMapping("/fun")
    public String fun()
    {
        return "index";
    }

    @RequestMapping(value="/fun2",method = RequestMethod.GET)
    public String fun2()
    {
        return "index";
    }

    @RequestMapping(value="/fun3",method={RequestMethod.GET,RequestMethod.POST})
    public String fun3()
    {
        return "index";
    }

}
