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

    public Accommodation getAccommodation(int id) {
        return accommodationRepository.getProduct(id);
    }

    public String getAccommodationName(int id) {
        try {
            Accommodation foundedAccommodation = accommodationRepository.getProduct(id);
            return foundedAccommodation.getName();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "exception!";
        }
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
