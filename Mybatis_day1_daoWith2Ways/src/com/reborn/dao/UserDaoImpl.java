package com.reborn.dao;

import com.reborn.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public class UserDaoImpl implements UserDao
{
    private SqlSessionFactory factory;
    @Override
    public User findUserById(int id)
    {
        SqlSession sqlSession = factory.openSession();
        User user = sqlSession.selectOne("dao.findUserById", 1);
        System.out.println(user);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findUserByName(String username)
    {
        SqlSession sqlSession = factory.openSession();
        List<User> users = sqlSession.selectList("dao.findUserByName","Selina");
        System.out.println(users);
        sqlSession.close();
        return  users;
    }

    @Override
    public void insetUser(User user)
    {
        SqlSession sqlSession = factory.openSession();
        sqlSession.insert("dao.insertUser",user);
        sqlSession.commit();
        System.out.println(user.getId());
        sqlSession.close();
    }
}
