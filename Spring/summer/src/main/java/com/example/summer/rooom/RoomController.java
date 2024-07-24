package com.example.summer.rooom;

import com.example.summer.accommodation.RoomRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
    private RoomService roomService = new RoomService();

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public String getAllRooms() {
        System.out.println(roomService.getAllRooms());
        return roomService.getAllRooms();
    }

    @RequestMapping(value = "/rooms", method = RequestMethod.POST)
    public ResponseEntity<String> addRooms(@RequestBody RoomRequestDto roomRequestDto) {
        return new ResponseEntity<>(roomService.addRooms(roomRequestDto), HttpStatus.CREATED);
    }
}
