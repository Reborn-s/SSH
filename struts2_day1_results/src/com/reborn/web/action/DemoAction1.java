package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Reborn。 on 2017/6/1.
 * 调用Servlet API
 */
public class DemoAction1 extends ActionSupport{
    public String execute()
    {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        ServletContext application = ServletActionContext.getServletContext();
        HttpSession session = request.getSession();
        System.out.println(request);
        System.out.println(response);
        System.out.println(application);
        System.out.println(session);

        return "success";
    }
}
