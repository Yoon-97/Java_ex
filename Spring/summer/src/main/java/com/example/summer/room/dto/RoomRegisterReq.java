package com.example.summer.room.dto;

import com.example.summer.room.Room;

public class RoomRegisterReq {
    String type;
    int price;
    int accommodationId;

    public int getAccommodationId() {
        return accommodationId;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public Room toRoom() {
        return new Room(type, price, accommodationId);
    }
}
