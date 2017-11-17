package com.reborn.AspectJ_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class Test {

    @org.junit.Test
    public void demo()
    {
        String xmlPath = "com/reborn/AspectJ_xml/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }
}
