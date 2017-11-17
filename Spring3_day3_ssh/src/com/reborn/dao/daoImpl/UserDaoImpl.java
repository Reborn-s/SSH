package com.reborn.dao.daoImpl;

import com.reborn.dao.UserDao;
import com.reborn.domain.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by Reborn。 on 2017/6/17.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }
}
