package com.reborn.jdkProxy;

/**
 * Created by Reborn。 on 2017/6/14.
 */
public class MyAspect {
    public void before()
    {
        System.out.println("-------before执行-------");
    }

    public void after()
    {
        System.out.println("-------after执行--------");
    }
}
