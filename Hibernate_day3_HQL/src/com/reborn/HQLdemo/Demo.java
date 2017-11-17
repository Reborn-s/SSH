package com.reborn.HQLdemo;

import com.reborn.HibernateUtils.HibernateUtils;
import com.reborn.domain.Customer;
import com.reborn.domain.Order;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Reborn。 on 2017/6/9.
 */
public class Demo {

    @Test
    public void findAll()
    {
        Session session = HibernateUtils.getSession();
        List<Customer> customers = session.createQuery("from Customer").list();
        System.out.println(customers);
        session.close();
    }

    @Test
    public void selectQuery()
    {
        Session session = HibernateUtils.getSession();
        //Query query = session.createQuery("from Customer where id=1");
        //Query query = session.createQuery("from Customer as c where c.id=1");
        Query query = session.createQuery("select c from Customer as c where c.id=1");

        Customer c = (Customer) query.uniqueResult();
        System.out.println(c);
        session.close();
    }

    @Test
    public void partQuery()
    {
        Session session = HibernateUtils.getSession();
        /*Query query = session.createQuery("select o.id,o.name from Order as o");
        List<Object[]> list = query.list();
        for(Object[] objects:list)
        {
            System.out.println(Arrays.toString(objects));
        }*/

        //如果是select Order的话，因为order是HQL关键字，所以会报错，要注意处理关键字
        Query query = session.createQuery("select new Customer(c.id,c.name) from Customer as c");
        List<Customer> customers = query.list();
        for(Customer c:customers)
            System.out.println(c);
        session.close();
    }

    @Test
    public void sortQuery()
    {
        Session session = HibernateUtils.getSession();

        Query query = session.createQuery("select new Customer (c.id,c.name) from Customer c order by c.id desc");
        List<Customer> customers = query.list();
        for(Customer c:customers)
            System.out.println(c);

        session.close();
    }

    @Test
    public void page()
    {
        Session session = HibernateUtils.getSession();
        Query query = session.createQuery("from Customer ");
        //初始索引是从0开始的，包括初始索引
        query.setFirstResult(1);
        query.setMaxResults(3);
        List<Customer> customers = query.list();
        for(Customer c:customers)
            System.out.println(c);

        session.close();
    }

    //绑定参数
    @Test
    public void parameter()
    {
        Session session = HibernateUtils.getSession();
        Integer id  = 1;
        Query query = session.createQuery("from Customer  where id=:xxx");
        query.setInteger("xxx",id);
        Customer customer = (Customer) query.uniqueResult();
        System.out.println(customer);
        session.close();
    }

    //聚合函数
    @Test
    public void aggregate()
    {
        Session session = HibernateUtils.getSession();
        //Query query = session.createQuery("select count(*) from Customer ");
        //Query query = session.createQuery("select min(c.id) from Customer c");
        //Query query = session.createQuery("select avg(c.id) from Customer c");
        Query query = session.createQuery("select c.name,count(*) from Customer c group by c.name");

        //Object o = query.uniqueResult();
        //System.out.println(o);
        List<Object[]> list = query.list();
        System.out.println(Arrays.toString(list.get(0)));
        session.close();
    }

    @Test
    public void outerJoin()
    {
        Session session = HibernateUtils.getSession();

        Query query = session.createQuery("select distinct c from Customer c left join c.orders");
        List list = query.list();
        System.out.println(list.size());
        for(Object o:list)
            System.out.println(o);

        session.close();
    }

    @Test
    public void innerJoin()
    {
        Session session = HibernateUtils.getSession();

        Query query = session.createQuery("select c from Customer c inner join c.orders");
        List list = query.list();
        System.out.println(list.size());
        for(Object o:list)
            System.out.println(o);

        session.close();
    }

    @Test
    public void nameQuery()
    {
        Session session = HibernateUtils.getSession();

        //局部
        Query query  = session.getNamedQuery("com.reborn.domain.Customer.findAll");
        List<Order> orders = query.list();
        for(Order order:orders)
            System.out.println(order);

        //全局
        query = session.getNamedQuery("findAll");
        List<Customer> customers = query.list();
        for(Customer customer:customers)
            System.out.println(customer);

        session.close();
    }
}
