package com.reborn.Demo;

import com.reborn.HibernateUtils.HibernateUtils;
import com.reborn.domain.Address;
import com.reborn.domain.Company;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * Created by Reborn。 on 2017/6/10.
 */
public class Demo {

    @Test
    public void fun1()
    {
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();

        Company company = new Company();
        company.setName("南方基金啦");

        Address address = new Address();
        address.setName("深圳");

        address.setCompany(company);

        session.save(company);
        session.save(address);

        transaction.commit();
        session.close();

    }

    @Test
    public void fun2()
    {
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();

        Company company = (Company) session.get(Company.class,4);
        System.out.println(company);

        transaction.commit();
        session.close();
    }
}
