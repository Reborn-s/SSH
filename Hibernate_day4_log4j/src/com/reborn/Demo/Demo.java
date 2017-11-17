package com.reborn.Demo;

import com.reborn.HibernateUtils.HibernateUtils;
import org.hibernate.Session;
import org.junit.Test;

/**
 * Created by Reborn。 on 2017/6/10.
 */
public class Demo {

    @Test
    public void fun()
    {
        Session session = HibernateUtils.getSession();
        System.out.println(session);
        session.close();
    }
}
