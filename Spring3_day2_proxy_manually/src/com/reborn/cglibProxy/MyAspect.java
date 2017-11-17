package com.reborn.cglibProxy;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class MyAspect {
    public void before()
    {
        System.out.println("-------cglib.before执行-------");
    }

    public void after()
    {
        System.out.println("-------cglib.after执行--------");
    }
}
