package com.reborn.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Reborn。 on 2017/6/13.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("初始化之前的前方法，目标类为："+s);
        return o;
        //如果这里返回null，会使后面的目标对象都为null从而引发空指针异常，因此绝对绝对不能赋值为null
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("初始化之后的后方法，目标类为："+s+", 并返回代理对象");
        ClassLoader classLoader = MyBeanPostProcessor.class.getClassLoader();
        Class[] interfaces = o.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("-------开启事务--------");
                Object object = method.invoke(o,args);
                System.out.println("-------提交事务--------");
                return object;
            }
        });
    }
}
