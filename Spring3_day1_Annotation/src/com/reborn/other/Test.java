package com.reborn.other;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Reborn。 on 2017/6/13.
 */
public class Test {

    @org.junit.Test
    public void fun()
    {
        String xmlPath = "com/reborn/other/applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = applicationContext.getBean("userService",UserService.class);
        UserService userService1 = applicationContext.getBean("userService",UserService.class);
        System.out.println(userService);
        System.out.println(userService1);
        userService.addUser();
        applicationContext.close();
    }
}
