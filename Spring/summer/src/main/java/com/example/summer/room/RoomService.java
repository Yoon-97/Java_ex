package com.example.summer.room;

import com.example.summer.exception.RoomNotFoundException;
import com.example.summer.room.dto.RequestRoomDto;
import com.example.summer.room.dto.RoomRegisterReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class RoomService {

    private RoomJPARepository roomRepository;

    @Autowired
    public RoomService(RoomJPARepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public String addRooms(RequestRoomDto roomRequestDto) {
        List<Room> roomList = roomRequestDto.getRooms();
        int accommodationId = roomRequestDto.getAccommodationId();
        return roomRepository.saveRoom(accommodationId, roomList);
    }

    public String getAllRooms() {
        StringBuilder sb = new StringBuilder();
        Map<Integer, List<Room>> foundedRoomList = roomRepository.findAllRooms();

        for (Integer i : foundedRoomList.keySet()) {
            sb.append("AccommodationId: " + i + "\n");
            for (Room room : foundedRoomList.get(i)) {
                sb.append(room.toString());
            }
            sb.append("\n----------------------\n");
        }
        return sb.toString();
    }

    public Room getRooms(int id) {
        return roomRepository.findRoomById(id).orElseThrow(
                () -> new RoomNotFoundException("no room: "));

    }

    @Transactional //
    public void saveRoom(RoomRegisterReq roomRegisterReq) {
        roomRepository.saveRoom(roomRegisterReq.toRoom());

    }
}
