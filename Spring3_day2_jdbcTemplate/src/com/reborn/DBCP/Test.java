package com.reborn.DBCP;

import com.reborn.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class Test {

    @org.junit.Test
    public void demo()
    {
       /* User user = new User();
        user.setUsername("吴青峰");
        user.setPassword("1234321");*/
        String xmlPath = "com/reborn/DBCP/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) context.getBean("userDao");
        List<User> userList = userDao.findAll();
        System.out.println(userList);
    }
}
