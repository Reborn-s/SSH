package com.reborn.AspectJ_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Reborn。 on 2017/6/14.
 */
@Component
@Aspect
public class MyAspect {

    //@Before("execution(* com.reborn.AspectJ_annotation.*.*(..))")
    public void myBefore()
    {
        System.out.println("-------AspectJ.before执行--------");
    }

    @Pointcut("execution(* com.reborn.AspectJ_annotation.*.*(..))")
    private void myPointCut(){}

    //@AfterReturning(value = "myPointCut()",returning = "ret")
    public void myAfterReturning(JoinPoint joinPoint,Object ret)
    {
        System.out.println("AspectJ.afterReturning执行:"+joinPoint.getSignature().getName()+"--->"+ret);
    }

    //@Around(value = "myPointCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("AspectJ 环绕事务开启啦");
        Object object = proceedingJoinPoint.proceed();
        System.out.println("AspectJ 环绕事务关闭啦");
        return object;
    }

    @After("myPointCut()")
    public void myAfter(JoinPoint joinPoint)
    {
        System.out.println("AspectJ.after执行:"+joinPoint.getSignature().getName());
    }

    @AfterThrowing(value = "execution(* com.reborn.AspectJ_annotation.UserServiceImpl.*(..))", throwing = "e")
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e)
    {
        System.out.println("出异常啦"+e.getMessage());
    }


}
