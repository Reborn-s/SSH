package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Reborn。 on 2017/6/3.
 */
public class Demo1Action extends ActionSupport {
    public String execute()
    {
        String key = getText("key");
        System.out.println(key);
        return SUCCESS;
    }
}
