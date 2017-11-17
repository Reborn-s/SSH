package com.reborn.staticFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Reborn。 on 2017/6/11.
 */
public class Test {

    @org.junit.Test
    public void fun()
    {

        String xmlPath = "com/reborn/staticFactory/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.addUser();

    }
}
