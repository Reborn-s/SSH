package com.reborn.regist.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Reborn。 on 2017/6/2.
 */
public class DaoFactory {
    private static Properties pro = null;
    static
    {
        pro = new Properties();
        InputStream in = DaoFactory.class.getClassLoader().getResourceAsStream("dao.properties");
        try {
            pro.load(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static IUserDao getDao()
    {
        String daoClassName = pro.getProperty("com.reborn.usermng.dao.UserDao");
        try {
            Class clazz = Class.forName(daoClassName);
            return (IUserDao) clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
