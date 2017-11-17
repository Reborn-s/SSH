package com.reborn.service.Impl;

import com.reborn.mapper.ItemsMapper;
import com.reborn.pojo.Items;
import com.reborn.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Reborn。 on 2017/10/17.
 */
@Service
public class ItemsServiceImpl implements ItemsService{

    @Resource
    private ItemsMapper itemsMapper;

    public List<Items> findAll() {
        return itemsMapper.findAll();
    }

    public Items findItemsById(int id) {
        return itemsMapper.selectItemsById(id);
    }

    public void insertItems(Items items)
    {
        itemsMapper.insertItems(items);
    }

    public void saveOrUpdate(Items items)
    {
        itemsMapper.updateItemsByPrimaryKey(items);
    }

    public void deleteById(int id)
    {
        itemsMapper.deleteItemsByPrimaryKey(id);
    }
}
