package com.example.summer.accommodation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccommodationController {
    private final AccommodationService accommodationService;

    @Autowired
    public AccommodationController(AccommodationService accommodationService) {
        this.accommodationService = accommodationService;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<?> addAccommodation(@RequestBody Accommodation accommodation) {
        Accommodation savedAccommodation = accommodationService.addAccommodation(accommodation);

        if (savedAccommodation != null)
            return new ResponseEntity<>(savedAccommodation, HttpStatus.CREATED);
        else
            return new ResponseEntity<>("실패", HttpStatus.BAD_REQUEST);
    }

//    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
//    public Accommodation getAccommodationName(@PathVariable int id) {
//        return accommodationService.getAccommodation(id);
//    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public String getAccommodationName(@PathVariable int id) {
        return accommodationService.getAccommodationName(id);
    }

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public String getAllRooms() {
        System.out.println(accommodationService.getAllRooms());
        return accommodationService.getAllRooms();
    }

    @RequestMapping(value = "/rooms", method = RequestMethod.POST)
    public ResponseEntity<String> addRooms(@RequestBody RoomRequestDto roomRequestDto) {
        return new ResponseEntity<>(accommodationService.addRooms(roomRequestDto), HttpStatus.CREATED);
    }

}
