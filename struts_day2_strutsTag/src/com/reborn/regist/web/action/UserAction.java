package com.reborn.regist.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.reborn.regist.domain.User;
import com.reborn.regist.service.IUserService;
import com.reborn.regist.service.Impl.UserServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.validation.SkipValidation;

/**
 * Created by Reborn。 on 2017/6/2.
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
    private IUserService service = new UserServiceImpl();
    private User user = new User();

    /*public void validateRegist() {
        String username = user.getUsername();
        if(StringUtils.isEmpty(username))
            addFieldError("username","用户名不能为空！");
    }*/

    public void validate() {
        String username = user.getUsername();
        if(StringUtils.isEmpty(username))
            addFieldError("username","用户名不能为空！");
    }

    @SkipValidation
    public String findAll()
    {
        return SUCCESS;
    }

    public String regist()
    {
        String username = user.getUsername();
        if(service.findByUsername(username)!=null)
            return "exists";
        else if(service.regist(user)>0)
            return SUCCESS;
        return NONE;
    }

    @Override
    public User getModel() {
        return user;
    }
}
