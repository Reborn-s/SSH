package com.reborn.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reborn.domain.Student;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Reborn。 on 2017/6/4.
 */
public class ActionContextDemo extends ActionSupport {
    public String execute()
    {
        ActionContext actionContext = ActionContext.getContext();
        actionContext.put("actionContextMap","hahaha");

        Map<String ,Object> session = actionContext.getSession();
        session.put("user","zhangsan");

        HttpSession session1 = ServletActionContext.getRequest().getSession();
        session1.setAttribute("name","lisi");

        Map<String,Object> application = actionContext.getApplication();
        application.put("student",new Student("001","wangwu",20));
        return SUCCESS;
    }
}
