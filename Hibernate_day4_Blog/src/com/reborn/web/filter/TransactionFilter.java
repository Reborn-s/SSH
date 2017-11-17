package com.reborn.web.filter;

import com.reborn.dao.HibernateUtils.HibernateUtils;
import org.hibernate.Session;

import java.io.IOException;

/**
 * Created by Reborn。 on 2017/6/10.
 */
public class TransactionFilter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        Session session = HibernateUtils.getCurrentSession();
        session.beginTransaction();
        try {
            chain.doFilter(req,resp);
            if(session!=null&&session.isOpen())
                session.getTransaction().commit();
        }catch (Exception e)
        {
            if(session!=null&&session.isOpen())
                session.getTransaction().rollback();
        }
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {

    }

}
