package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by Reborn。 on 2017/6/3.
 */
public class LoginAction extends ActionSupport {
    public String login()
    {
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute("user","user");
        return SUCCESS;
    }
}
