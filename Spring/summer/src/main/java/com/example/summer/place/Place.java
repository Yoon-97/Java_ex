package com.example.summer.place;

import com.example.summer.rooom.Room;

import java.util.List;

public class Place {
    private int id;
    private String name;
    private List<Room> roomType;

    public Place(int id, String name, List<Room> roomType) {
        this.id = id;
        this.name = name;
        this.roomType = roomType;
    }

    public String getName() {
        return name;
    }
}
