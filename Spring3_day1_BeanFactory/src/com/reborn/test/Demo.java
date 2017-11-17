package com.reborn.test;

import com.reborn.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Reborn。 on 2017/6/11.
 */
public class Demo {

    @Test
    public void fun()
    {

        //BeanFactory对bean对象是懒加载，只有在getBean被调用的时候才会实例化对象
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        UserService userService = (UserService) factory.getBean("userService");
        userService.addUser();
    }

    @Test
    public void fun2()
    {
        String xmlPath = "applicationContext.xml";
        //ApplicationContext会在加载配置文件的时候就马上实例化bean对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.addUser();
    }
}


