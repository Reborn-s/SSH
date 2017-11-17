package com.reborn.springAOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class MyAspect implements MethodInterceptor{
    public void before()
    {
        System.out.println("-------SpringAOP.before执行-------");
    }

    public void after()
    {
        System.out.println("-------SpringAOP.after执行--------");
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        Object obj = methodInvocation.proceed();
        after();
        return obj;
    }
}
