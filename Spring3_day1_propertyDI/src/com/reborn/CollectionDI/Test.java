package com.reborn.CollectionDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Reborn。 on 2017/6/13.
 */
public class Test {

    @org.junit.Test
    public void fun()
    {
        String xmlPath = "com/reborn/CollectionDI/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        CollectionData collectionData = applicationContext.getBean("colldata",CollectionData.class);
        System.out.println(collectionData);
    }
}
