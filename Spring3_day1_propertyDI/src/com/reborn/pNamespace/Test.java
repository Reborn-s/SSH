package com.reborn.pNamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Reborn。 on 2017/6/13.
 */
public class Test {

    @org.junit.Test
    public void fun()
    {
        String xmlPath = "com/reborn/pNamespace/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Person person = applicationContext.getBean("person",Person.class);
        System.out.println(person);
    }
}
