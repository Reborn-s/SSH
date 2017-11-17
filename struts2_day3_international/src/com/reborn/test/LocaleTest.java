package com.reborn.test;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Reborn。 on 2017/6/3.
 */
public class LocaleTest {
    @Test
    public void fun1()
    {
        ResourceBundle bundle = ResourceBundle.getBundle("com.reborn.resources.res", Locale.CHINA);
        String key = bundle.getString("key");
        System.out.println(key);

        ResourceBundle bundle1 = ResourceBundle.getBundle("com.reborn.resources.res",Locale.US);
        System.out.println(bundle1.getString("key"));
    }

}
