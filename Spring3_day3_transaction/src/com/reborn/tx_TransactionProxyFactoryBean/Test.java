package com.reborn.tx_TransactionProxyFactoryBean;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Reborn。 on 2017/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:com/reborn/tx_TransactionProxyFactoryBean/applicationContext.xml")
public class Test {

    @Autowired
    private AccountService proxyAccountService;
    @org.junit.Test
    public void demo()
    {
        proxyAccountService.transfer("jack","rose",1000);
    }
}
