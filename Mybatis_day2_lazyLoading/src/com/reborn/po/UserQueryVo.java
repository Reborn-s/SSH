package com.reborn.po;

import java.util.List;

/**
 * User包装类
 * Created by Reborn。 on 2017/7/23.
 */
public class UserQueryVo
{
    //还可以添加其他的信息，比如订单或者商品等
    //用户信息
    private UserExt userExt;
    private List<Integer> idList;

    public List<Integer> getIdList()
    {
        return idList;
    }

    public void setIdList(List<Integer> idList)
    {
        this.idList = idList;
    }

    public UserExt getUserExt()
    {
        return userExt;
    }

    public void setUserExt(UserExt userExt)
    {
        this.userExt = userExt;
    }
}
