package com.example.summer.room.dto;

import com.example.summer.room.Room;

import java.util.List;

public class RequestRoomDto {
    private int accommodationId;
    private List<Room> rooms;

    public List<Room> getRooms() {
        return rooms;
    }

    public int getAccommodationId() {
        return accommodationId;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void setAccommodationId(int accommodationId) {
        this.accommodationId = accommodationId;
    }
}
