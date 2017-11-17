package com.reborn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Reborn。 on 2017/8/10.
 */
@Controller
@RequestMapping("/direction")
public class ForwardandRedirect
{
    @RequestMapping("forward")
    public String forward()
    {
        //本类方法之间进行forward
        // return "forward:list.do";
        //return "forward:/direction/list.do";

        //跨类进行转发
        return "forward:/items/list.do";
    }

    public String redirect()
    {
        //本类之间进行重定向
        return "redirect:list.do";
//        return "redirect:/directions/list.do";

        //跨类重定向
//        return "redirect:/items/list.do";
    }

    @RequestMapping("list")
    public String list()
    {
        return "index";
    }
}
