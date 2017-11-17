package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Reborn。 on 2017/6/4.
 */
public class ResubmitAction extends ActionSupport {
    private String name;
    public String login()
    {
        System.out.println(name);
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
