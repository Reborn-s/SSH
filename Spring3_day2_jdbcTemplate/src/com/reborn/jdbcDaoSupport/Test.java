package com.reborn.jdbcDaoSupport;

import com.reborn.c3p0.UserDao;
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
        User user = new User();
        user.setId(5);
        user.setUsername("吴青峰");
        user.setPassword("46456");
        String xmlPath = "com/reborn/c3p0/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        com.reborn.c3p0.UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.update(user);
    }
}
