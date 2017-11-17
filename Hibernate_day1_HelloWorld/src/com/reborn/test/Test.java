package com.reborn.test;

import com.reborn.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by Reborn。 on 2017/6/5.
 */
public class Test {
    @org.junit.Test
    public void fun()
    {
        Configuration conf = new Configuration().configure();
        SessionFactory sessionFactory = conf.buildSessionFactory();
        Session session = sessionFactory.openSession();
        User user = new User();
        user.setUsername("hebe");
        user.setPassword("123");
        session.save(user);
        session.close();
        sessionFactory.close();
    }
}
