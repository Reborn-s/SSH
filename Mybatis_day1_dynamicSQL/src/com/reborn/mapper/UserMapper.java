package com.reborn.mapper;

import com.reborn.po.UserExt;
import com.reborn.po.UserQueryVo;

import java.util.List;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public interface UserMapper
{
    List<UserExt> findUserListIf(UserQueryVo userQueryVo);
    int findUserCountIf(UserQueryVo userQueryVo);

    int findUserCountSql(UserQueryVo userQueryVo);

    List<UserExt> findUserInIdList(UserQueryVo userQueryVo);
}
