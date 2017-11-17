package com.reborn.regist.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.reborn.regist.domain.User;
import com.reborn.regist.service.IUserService;
import com.reborn.regist.service.Impl.UserServiceImpl;

/**
 * Created by Reborn。 on 2017/6/2.
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
    private IUserService service = new UserServiceImpl();
    private User user = new User();
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
