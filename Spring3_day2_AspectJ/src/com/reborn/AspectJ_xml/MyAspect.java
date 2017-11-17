package com.reborn.AspectJ_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class MyAspect{
    public void myBefore()
    {
        System.out.println("-------AspectJ.before执行--------");
    }

    public void myAfterReturning(JoinPoint joinPoint,Object ret)
    {
        System.out.println("AspectJ.afterReturning执行:"+joinPoint.getSignature().getName()+"--->"+ret);
    }

    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("AspectJ 环绕事务开启啦");
        Object object = proceedingJoinPoint.proceed();
        System.out.println("AspectJ 环绕事务关闭啦");
        return object;
    }

    public void myAfter(JoinPoint joinPoint)
    {
        System.out.println("AspectJ.after执行:"+joinPoint.getSignature().getName());
    }

    public void myAfterThrowing(JoinPoint joinPoint,Throwable e)
    {
        System.out.println("出异常啦"+e.getMessage());
    }


}
