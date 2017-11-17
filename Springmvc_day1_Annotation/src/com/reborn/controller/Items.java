package com.reborn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Reborn。 on 2017/8/11.
 */
@Controller
@RequestMapping("/items")
public class Items
{
    @RequestMapping("list")
    public String list()
    {
        return "index";
    }
}
