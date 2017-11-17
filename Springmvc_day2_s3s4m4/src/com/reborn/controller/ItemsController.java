package com.reborn.controller;

import com.reborn.pojo.Items;
import com.reborn.service.ItemsService;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Reborn。 on 2017/10/17.
 */
@Controller
@RequestMapping("items")
public class ItemsController {

    @Resource
    private ItemsService itemsService;

    @RequestMapping("listAll")
    public String listAll(Model model)
    {
        List<Items> itemsList =  itemsService.findAll();
        model.addAttribute("itemsList",itemsList);
        return "itemsList";
    }

    @RequestMapping("edit")
    public String edit(Integer id,Model model)
    {
        Items items = itemsService.findItemsById(id);
        model.addAttribute("items",items);
        return "editItem";
    }

    @RequestMapping("saveOrUpdate")
    public String saveOrUpdate(Items items)
    {
        itemsService.saveOrUpdate(items);
        return "redirect:list.do";
    }

    @RequestMapping("deleteItemsById")
    public String deleteItemsById(Integer id)
    {
        itemsService.deleteById(id);
        return "redirect:list.do";
    }

    @RequestMapping("deleteByIds")
    public String deleteByIds(Integer[] ids)
    {
        for(Integer id:ids)
            itemsService.deleteById(id);
        return "redirect:list.do";
    }


    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,true));
    }


}
