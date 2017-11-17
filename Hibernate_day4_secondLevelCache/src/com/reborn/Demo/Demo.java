package com.reborn.Demo;

import com.reborn.HibernateUtils.HibernateUtils;
import com.reborn.domain.Customer;
import com.reborn.domain.Order;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import java.util.List;

/**
 * Created by Reborn。 on 2017/6/10.
 */
public class Demo {

    @Test
    public void fun1()
    {
        Session session = HibernateUtils.getSession();

        Customer c1 = (Customer) session.get(Customer.class,3);
        System.out.println(c1);

        session.clear();

        Customer c2 = (Customer) session.get(Customer.class,3);
        System.out.println(c2);

        session.close();
    }

    @Test
    public void fun2()
    {
        Session session = HibernateUtils.getSession();

        Customer c1 = (Customer) session.get(Customer.class,3);
        for(Order o:c1.getOrders())
            System.out.println(o);

        session.clear();

        Customer c2 = (Customer) session.get(Customer.class,3);
        for(Order o:c2.getOrders())
            System.out.println(o);

        session.close();
    }

    @Test
    public void fun3()
    {
        Session session = HibernateUtils.getSession();

        Query query = session.createQuery("from Customer ");
        query.setCacheable(true);
        List<Customer> customers = query.list();
        for(Customer c:customers)
            System.out.println(c);

        session.clear();

        Query query1 = session.createQuery("from Customer ");
        query1.setCacheable(true);
        List<Customer> customers1 = query1.list();
        for(Customer c:customers1)
            System.out.println(c);

        session.close();
    }
}
