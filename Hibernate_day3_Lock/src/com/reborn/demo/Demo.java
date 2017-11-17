package com.reborn.demo;

import com.reborn.HibernateUtils.HibernateUtils;
import com.reborn.domain.Customer;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * Created by Reborn。 on 2017/6/9.
 */
public class Demo {
    @Test
    public void fun()
    {
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();
        //悲观锁
        Customer customer = (Customer) session.get(Customer.class,1, LockMode.UPGRADE);
        System.out.println(customer);
        transaction.commit();
        session.close();
    }

    //乐观锁
    @Test
    public void optimistic()
    {
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = (Customer) session.get(Customer.class,3);
        customer.setName("selina");
        transaction.commit();
        session.close();
    }
}
