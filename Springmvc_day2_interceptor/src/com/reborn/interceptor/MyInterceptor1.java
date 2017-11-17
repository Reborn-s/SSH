package com.reborn.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Reborn。 on 2017/10/20.
 * 自定义springmvc的拦截器
 */
public class MyInterceptor1 implements HandlerInterceptor {

    /**
     * preHandler在处理器映射器之前执行
     * return true:放行；return false：拦截
     * 主要是使用这个方法
     * 如果return false,依然会执行此拦截器的afterCompletion
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("第一个拦截器：preHandler...");
        return true;
    }

    //在还没有调用controller，并且还没有返回ModelView的时候执行
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, org.springframework.web.servlet.ModelAndView modelAndView) throws Exception {
        System.out.println("第一个拦截器：postHandle...");

    }


    //返回ModelView之后执行
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("第一个拦截器：afterCompletion...");

    }
}
