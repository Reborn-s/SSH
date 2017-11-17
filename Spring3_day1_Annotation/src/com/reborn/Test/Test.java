package com.reborn.Test;

import com.reborn.web.action.UserAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Reborn。 on 2017/6/13.
 */
public class Test {

    @org.junit.Test
    public void fun()
    {
        String xmlPath = "com/reborn/Test/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserAction userAction = applicationContext.getBean("userAction",UserAction.class);
        userAction.execute();
    }
}
