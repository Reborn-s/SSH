package com.reborn.manyToOne;

import com.reborn.HibernateUtils.HibernateUtils;
import com.reborn.domain.Customer;
import com.reborn.domain.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Reborn。 on 2017/6/9.
 */
public class Test {

    @org.junit.Test
    public void fun()
    {
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();

        Customer c = new Customer();
        c.setName("hebe");

        Order o1 = new Order();
        o1.setName("香蕉");
        o1.setCustomer(c);

        Order o2 = new Order();
        o2.setName("火龙果");
        o2.setCustomer(c);

        c.getOrders().add(o1);
        c.getOrders().add(o2);
        session.save(c);

        transaction.commit();
        session.close();
    }

    @org.junit.Test
    public void funDelete()
    {
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = (Customer) session.get(Customer.class,2);
        session.delete(customer);

        transaction.commit();
        session.close();
    }
}
