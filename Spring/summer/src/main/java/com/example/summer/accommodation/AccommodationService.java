package com.example.summer.accommodation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccommodationService {
    AccommodationRepository accommodationRepository;

    @Autowired
    public AccommodationService(AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    public Accommodation getProduct(int id) {
        return accommodationRepository.getProduct(id);
    }

    public String getProductName(int id) {
        return accommodationRepository.getProduct(id).getName();
    }

    public Accommodation addAccommodation(Accommodation accommodation) {
        return accommodationRepository.saveProduct(accommodation);
    }

    public String addRooms(RoomRequestDto roomRequestDto) {
        List<Room> roomList = roomRequestDto.getRooms();
        int accommodationId = roomRequestDto.getAccommodationId();
        return accommodationRepository.saveRoom(accommodationId, roomList);
    }

    public String getAllRooms() {
        return accommodationRepository.findAllRooms();
    }
}
