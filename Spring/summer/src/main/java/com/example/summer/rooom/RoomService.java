package com.example.summer.rooom;

import com.example.summer.accommodation.RoomRequestDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private RoomRepository roomRepository = new RoomRepository();

    public String addRooms(RoomRequestDto roomRequestDto) {
        List<Room> roomList = roomRequestDto.getRooms();
        int accommodationId = roomRequestDto.getAccommodationId();
        return roomRepository.saveRoom(accommodationId, roomList);
    }

    public String getAllRooms() {
        return roomRepository.findAllRooms();
    }
}
