package com.reborn.propertities;

import com.reborn.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class Test {

    @org.junit.Test
    public void demo()
    {
        String xmlPath = "com/reborn/propertities/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) context.getBean("userDao");
        User user = userDao.findById(4);
        System.out.println(user);
    }
}
