package com.reborn.jdkProxy;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class Test {

    @org.junit.Test
    public void demo()
    {
        UserService userService = new UserServiceImpl();
        MyAspect advice = new MyAspect();
        ProxyFactory factory = new ProxyFactory();
        factory.setTargetObject(userService);
        factory.setAdvice(advice);
        UserService proxyUserService = (UserService) factory.createProxyOject();
        proxyUserService.addUser();
    }
}
