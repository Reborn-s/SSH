package com.reborn.service;

import com.reborn.pojo.Items;

import java.util.List;

/**
 * Created by Reborn。 on 2017/10/17.
 */
public interface ItemsService {

    List<Items> findAll();
    Items findItemsById(int id);
    void insertItems(Items items);
    void saveOrUpdate(Items items);
    void deleteById(int id);
}
