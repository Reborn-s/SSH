package com.reborn.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class ProxyFactory {
    private Object targetObject;
    private MyAspect advice;

    public Object createProxyOject()
    {
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class[] interfaces = targetObject.getClass().getInterfaces();
        Object proxyObject =  Proxy.newProxyInstance(classLoader, interfaces,
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        advice.before();
                        Object object = method.invoke(targetObject,args);
                        advice.after();
                        return object;
                    }
                });
        return proxyObject;
    }

    public Object getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(Object targetObject) {
        this.targetObject = targetObject;
    }

    public MyAspect getAdvice() {
        return advice;
    }

    public void setAdvice(MyAspect advice) {
        this.advice = advice;
    }
}
