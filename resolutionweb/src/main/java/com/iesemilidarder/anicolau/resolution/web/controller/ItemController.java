package com.iesemilidarder.anicolau.resolution.web.controller;


import java.util.List;

import com.iesemilidarder.anicolau.resolution.web.bean.Item;
import com.iesemilidarder.anicolau.resolution.web.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;



@RestController
@RequestMapping(value={"/items"})
public class ItemController {

    @Autowired
    ItemService ItemService;


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Item> getItemById(@PathVariable("id") int id) {
        System.out.println("Fetching Item with id " + id);

        Item item = ItemService.findById(id);
        if (item == null) {
            return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Item>(item, HttpStatus.OK);
    }

    @PostMapping(value="/create",headers="Accept=application/json")
    public ResponseEntity<Void> createItem(@RequestBody Item item, UriComponentsBuilder ucBuilder){
        System.out.println("Creating Item "+ item.getName());
        ItemService.createItem(item);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/item/{id}").buildAndExpand(item.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @GetMapping(value="/get", headers="Accept=application/json")
    public List<Item> getAllItem() {
        List<Item> tasks=ItemService.getItem();
        return tasks;

    }

    @PutMapping(value="/update", headers="Accept=application/json")
    public ResponseEntity<String> updateItem(@RequestBody Item currentItem)
    {
        Item item = ItemService.findById(currentItem.getId());
        if (item ==null) {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        item.setId(currentItem.getId());
        item.setName(currentItem.getName());
        item.setDescription(currentItem.getDescription());
        item.setPrice(currentItem.getPrice());
        ItemService.update(item);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}", headers ="Accept=application/json")
    public ResponseEntity<Item> deleteItem(@PathVariable("id") int id){
        Item item = ItemService.findById(id);
        if (item == null) {
            return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
        }
        ItemService.deleteItemById(id);
        return new ResponseEntity<Item>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping(value="/{id}", headers="Accept=application/json")
    public ResponseEntity<Item> updateItemPartial(@PathVariable("id") int id, @RequestBody Item currentItem){
        Item item = ItemService.findById(id);
        if(item ==null){
            return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
        }

        ItemService.updatePartially(currentItem, id);
        return new ResponseEntity<Item>(item, HttpStatus.OK);
    }
}