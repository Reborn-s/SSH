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
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        User u = new User();
        u.setUsername("selina");
        u.setPassword("123");
        session.save(u);
        session.close();
        sessionFactory.close();
    }
}
