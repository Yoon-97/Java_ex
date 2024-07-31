package com.example.summer.accommodation;

import com.example.summer.room.Room;

import java.util.List;

public class Accommodation {
    private int id;
    private String name;
    private int minPrice;
    private List<Room> roomList;


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

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }
}
