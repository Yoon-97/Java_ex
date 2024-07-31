package com.example.summer.room;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Room {
    @Id
    private int id;
    private String type;
    private int price;
    private int accommodationId;

    public Room(String type, int price, int accommodationId) {
        this.type = type;
        this.price = price;
        this.accommodationId = accommodationId;
    }

    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomName='" + type + '\'' +
                ", price=" + price +
                ", accommodationId='" + accommodationId + '\'' +
                '}' + "\n";
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getAccommodationId() {
        return accommodationId;
    }
}
