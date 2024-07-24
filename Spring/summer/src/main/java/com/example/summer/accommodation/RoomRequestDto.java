package com.example.summer.accommodation;

import com.example.summer.rooom.Room;

import java.util.List;

public class RoomRequestDto {
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
