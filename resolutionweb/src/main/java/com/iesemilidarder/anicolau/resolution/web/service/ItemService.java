package com.iesemilidarder.anicolau.resolution.web.service;

import java.util.List;


import com.iesemilidarder.anicolau.resolution.web.bean.Item;

public interface ItemService {
    public void createItem(Item item);
    public List<Item> getItem();
    public Item findById(int id);
    public void update(Item item);
    public void deleteItemById(int id);
    public void updatePartially(Item item, int id);
}