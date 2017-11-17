package com.reborn.tx_aop_xml;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by Reborn。 on 2017/6/17.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void in(String inner, Integer money) {
        String sql = "update account set money=money+? where username=?";
        this.getJdbcTemplate().update(sql,money,inner);
    }

    @Override
    public void out(String outer, Integer money) {
        String sql = "update account set money = money-? where username=?";
        this.getJdbcTemplate().update(sql,money,outer);
    }
}
