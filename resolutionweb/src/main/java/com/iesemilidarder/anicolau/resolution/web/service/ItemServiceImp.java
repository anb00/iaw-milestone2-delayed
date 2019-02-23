package com.iesemilidarder.anicolau.resolution.web.service;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.iesemilidarder.anicolau.resolution.web.bean.Item;
import org.springframework.stereotype.Service;



@Service
public class ItemServiceImp implements ItemService {

    private static List<Item> items;

    static {
        items = dummyUsers();
    }

    @Override
    public void createItem(Item item) {

    }

    public List<Item> getItem() {
        // TODO Auto-generated method stub
        return items;
    }

    public Item findById(int id) {
        // TODO Auto-generated method stub
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void createUser(Item item) {
        // TODO Auto-generated method stub
        items.add(item);
    }

    public void deleteUserById(int id) {
        // TODO Auto-generated method stub
        Iterator<Item> it = items.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            if (item.getId() == id) {
                it.remove();
            }
        }
    }

    public void updatePartially(Item currentItem, int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                if (currentItem.getDescription() != null) {
                    item.setId(id);
                    item.setDescription(currentItem.getDescription());
                }
                item.setName(item.getName());
                update(item);
            }
        }

    }

    public void update(Item item) {
        // TODO Auto-generated method stub
        int index = items.indexOf(item);
        items.set(index, item);
    }

    @Override
    public void deleteItemById(int id) {

    }

    private static List<Item> dummyUsers() {
        // TODO Auto-generated method stub
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(1, "ITEM1", "simple",100d));
       // items.add(new Item(6,"))
        items.add(new Item(2, "ITEM2", "UK",300d));
        items.add(new Item(3, "ITEM3", "INDIA",500d));
        items.add(new Item(4, "ITEM4", "USA",700d));
        items.add(new Item(5,"I5","I5",900d));
        return items;
    }

}