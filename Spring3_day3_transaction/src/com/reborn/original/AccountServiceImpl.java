package com.reborn.original;

/**
 * Created by Reborn。 on 2017/6/17.
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, Integer money) {
        accountDao.out(outer,money);
        accountDao.in(inner,money);
    }
}
