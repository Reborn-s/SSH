package com.reborn.regist.service;

import com.reborn.regist.domain.User;

/**
 * Created by Reborn。 on 2017/6/2.
 */
public interface IUserService {
    User findByUsername(String username);
    int regist(User user);
}
