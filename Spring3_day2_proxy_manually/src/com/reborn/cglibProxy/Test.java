package com.reborn.cglibProxy;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class Test {

    @org.junit.Test
    public void demo()
    {
        UserServiceImpl userService = new UserServiceImpl();
        MyAspect advice = new MyAspect();
        ProxyFactory factory = new ProxyFactory();
        factory.setTargetObject(userService);
        factory.setAdvice(advice);
        UserServiceImpl proxyUserService = (UserServiceImpl) factory.createProxyOject();
        proxyUserService.addUser();
    }
}
