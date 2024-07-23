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
    public ResponseEntity<Accommodation> addAccommodation(@RequestBody Accommodation accommodation) {
        Accommodation savedAccommodation = accommodationService.addAccommodation(accommodation);
        return new ResponseEntity<>(savedAccommodation, HttpStatus.CREATED);
    }

//    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
//    public Accommodation getAccommodation(@PathVariable int id) {
//        return accommodationService.getProduct(id);
//    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public String getAccommodation(@PathVariable int id) {
        return accommodationService.getProductName(id);
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
