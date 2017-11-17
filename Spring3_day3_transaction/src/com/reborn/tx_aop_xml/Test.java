package com.reborn.tx_aop_xml;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Reborn。 on 2017/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:com/reborn/tx_aop_xml/applicationContext.xml")
public class Test {

    @Autowired
    private AccountService accountService;
    @org.junit.Test
    public void demo()
    {
        accountService.transfer("jack","rose",1000);
    }
}
