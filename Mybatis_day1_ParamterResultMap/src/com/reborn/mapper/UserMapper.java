package com.reborn.mapper;

import com.reborn.po.User;
import com.reborn.po.UserExt;
import com.reborn.po.UserQueryVo;

import java.util.List;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public interface UserMapper
{
    UserExt findUserById(int id);
    List<UserExt> findUserByName(String name);
    void insertUser(User user);
    List<UserExt> findUserList(UserQueryVo userQueryVo);
    int findUserCount(UserQueryVo userQueryVo);
    User findUserByIdResultMap(int id);

    List<UserExt> findUserListIf(UserQueryVo userQueryVo);
    int findUserCountIf(UserQueryVo userQueryVo);

    int findUserCountSql(UserQueryVo userQueryVo);
}
