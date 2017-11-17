package com.reborn.cglibProxy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class ProxyFactory {
    private Object targetObject;
    private MyAspect advice;

    public Object createProxyOject()
    {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        MethodInterceptor methodInterceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                if(advice!=null)
                    advice.before();
                Object object = method.invoke(targetObject,objects);
                if(advice!=null)
                    advice.after();
                return object;
            }
        };
        enhancer.setCallback(methodInterceptor);
        Object proxyObject = enhancer.create();
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
