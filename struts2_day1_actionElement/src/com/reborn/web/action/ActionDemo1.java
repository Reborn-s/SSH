package com.reborn.web.action;

import com.opensymphony.xwork2.Action;

/**
 * Created by Reborn。 on 2017/6/1.
 */
public class ActionDemo1 implements Action{
    @Override
    public String execute() throws Exception {
        System.out.println();
        return SUCCESS;
    }
}
