package com.reborn.HibernateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Reborn。 on 2017/6/5.
 */
public class HibernateUtils {
    private static final SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        //虚拟机关闭时也关闭sessionFactory
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                sessionFactory.close();
            }
        }));
    }

    public static Session getSession()
    {
        return sessionFactory.openSession();
    }

    public static Session getCurrentSession()
    {
        return sessionFactory.getCurrentSession();
    }

}
