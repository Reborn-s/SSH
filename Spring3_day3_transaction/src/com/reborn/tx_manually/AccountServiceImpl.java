package com.reborn.tx_manually;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by Reborn。 on 2017/6/17.
 */
public class AccountServiceImpl implements AccountService {
    private TransactionTemplate transactionTemplate;
    private AccountDao accountDao;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, Integer money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {

            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.out(outer,money);
                //int i = 1/0;
                accountDao.in(inner,money);
            }
        });
        

    }
}
