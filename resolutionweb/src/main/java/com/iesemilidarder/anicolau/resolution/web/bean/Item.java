package com.iesemilidarder.anicolau.resolution.web.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.UUID;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Item {

    private int id ;
    private String description;
    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double price;
    public Item(){
        id=0;
    }
    public Item(int id, String name, String description, Double price){
        this.id = id;
        this.name = name;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public String getCountry() {
        return description;
    }

    public void setCountry(String country) {
        this.description = country;
    }*/

    public String toString()
    {
        return"name:"+name;
    }

}
