package com.example.summer.accommodation;

public class Room {
    private String roomName;
    private int price;
    private String description;

    public Room(String roomName, int price, String description) {
        this.roomName = roomName;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}' + "\n";
    }
}
