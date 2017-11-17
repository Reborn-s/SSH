package com.reborn.dao.Impl;

import com.reborn.dao.HibernateUtils.HibernateUtils;
import com.reborn.dao.TopicDao;
import com.reborn.domain.Topic;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Reborn。 on 2017/6/10.
 */
public class TopicDaoImpl implements TopicDao {
    @Override
    public void add(Topic topic) {
        Session session = HibernateUtils.getCurrentSession();
        session.save(topic);
    }

    @Override
    public List<Topic> getAll(String key) {
        Session session = HibernateUtils.getCurrentSession();
        Query query = session.createQuery("from Topic where title like :key");
        if(key!=null&&!"".equals(key.trim()))
        {
            query.setString("key","%"+key+"%");
        }else
            query.setString("key","%");
        return query.list();
    }
}
