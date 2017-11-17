package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Reborn。 on 2017/6/2.
 */
public class Demo1Action extends ActionSupport{
    private String username;
    private String password;

    public String addUser()
    {
        System.out.println(username+" ,  "+ password);
        return NONE;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
