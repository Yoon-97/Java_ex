package com.example.summer.accommodation;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AccommodationRepository {
    private Map<Integer, Accommodation> accommodationTable = new HashMap<>();
    private int accommodationIdx = 0;

    private Map<Integer, List<Room>> roomTable = new HashMap<>();
    private int roomIdx = 0;

    public AccommodationRepository(Map<Integer, Accommodation> accommodationTable) {
        this.accommodationTable = accommodationTable;
    }

    public Accommodation getProduct(int id) {
        return accommodationTable.get(id);
    }

    public Accommodation saveProduct(Accommodation accommodation) {
        accommodation.setId(accommodationIdx++);
        accommodationTable.put(accommodationIdx++, accommodation);
        return (getProduct(accommodationIdx - 1));
    }

    public String saveRoom(int accommodationId, List<Room> roomList) {
        roomTable.put(accommodationId, roomList);
        return ("방이 추가 되었습니다.");
    }

    public String findAllRooms() {
        StringBuilder sb = new StringBuilder();
        for (Integer i : roomTable.keySet()) {
            sb.append("AccommodationId: " + i + "\n");
            List<Room> roomList = roomTable.get(i);
            for (Room room : roomList) {
                sb.append(room.toString());
            }
            sb.append("\n----------------------\n");

        }
        return sb.toString();
    }
}
