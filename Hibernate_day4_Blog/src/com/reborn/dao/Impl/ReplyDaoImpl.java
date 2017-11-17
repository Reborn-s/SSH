package com.reborn.dao.Impl;

import com.reborn.dao.HibernateUtils.HibernateUtils;
import com.reborn.dao.ReplyDao;
import com.reborn.domain.Reply;
import com.reborn.domain.Topic;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Reborn。 on 2017/6/10.
 */
public class ReplyDaoImpl implements ReplyDao {
    @Override
    public List<Reply> getAllReply(Topic topic) {
        Session session = HibernateUtils.getCurrentSession();
        Query query = session.createQuery("from Reply where topic=:topic");
        return query.list();
    }

    @Override
    public void addReply(Reply reply) {
        Session session = HibernateUtils.getCurrentSession();
        session.save(reply);
    }
}
