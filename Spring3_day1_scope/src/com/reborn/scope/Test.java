package com.reborn.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Reborn。 on 2017/6/11.
 */
public class Test {

    @org.junit.Test
    public void fun()
    {
        String xmlPath = "com/reborn/scope/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userService");
        UserService userService1 = (UserService) applicationContext.getBean("userService");

        System.out.println(userService);
        System.out.println(userService1);

    }
}
