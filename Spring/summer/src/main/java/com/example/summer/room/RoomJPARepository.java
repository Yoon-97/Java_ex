package com.example.summer.room;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class RoomJPARepository implements RoomRepository {

    EntityManager entityManager;

    @Autowired
    public RoomJPARepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public void saveRoom(Room room) {
        entityManager.persist(room);
    }

    private Map<Integer, List<Room>> roomTable = new HashMap<>();
    private int roomIdx = 0;
    private List<Room> nullRooms = new ArrayList<Room>();

    public String saveRoom(int accommodationId, List<Room> roomList) {
        roomTable.put(accommodationId, roomList);
        return ("방이 추가 되었습니다.");
    }

    public Map<Integer, List<Room>> findAllRooms() {
        return roomTable;
    }

    public Optional<Room> findRoomById(int id) {
        return Optional.ofNullable(entityManager.find(Room.class, id));
    }

    @Override
    public Room save() {
        return null;
    }
}
