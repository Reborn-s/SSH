package com.reborn.mapper;

import com.reborn.pojo.Items;

import java.util.List;

/**
 * Created by Reborn。 on 2017/10/17.
 */
public interface ItemsMapper {
    int countItems(Items items);
    void deleteItems(Items items);
    void deleteItemsByPrimaryKey(Integer id);
    void insertItems(Items items);
    List<Items> findAll();
    Items selectItemsById(Integer id);
    void updateItemsByPrimaryKey(Items items);
    void updateItemsByPrimaryKeySelective(Items items);
}
