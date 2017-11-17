package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Reborn。 on 2017/6/1.
 */
public class ActionDemo2 extends ActionSupport {
    public String execute()
    {
        System.out.println("123");
        return SUCCESS;
    }
}
