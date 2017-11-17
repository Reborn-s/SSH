package com.reborn.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Reborn。 on 2017/8/3.
 */
public class MyController implements Controller
{
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello","Hello World!");
        mv.setViewName("index");
        return mv;
    }
}
