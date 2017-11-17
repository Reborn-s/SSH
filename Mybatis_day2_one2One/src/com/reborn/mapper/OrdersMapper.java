package com.reborn.mapper;

import com.reborn.po.OrdersExt;

import java.util.List;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public interface OrdersMapper
{
    List<OrdersExt> findOrdersUser();

    List<OrdersExt> findOrdersUserRstMap();
}
