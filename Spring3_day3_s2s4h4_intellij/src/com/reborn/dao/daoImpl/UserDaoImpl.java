package com.reborn.dao.daoImpl;

import com.reborn.dao.UserDao;
import com.reborn.domain.User;
import org.hibernate.SessionFactory;

/**
 * Created by Reborn。 on 2017/6/17.
 */
public class UserDaoImpl implements UserDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
