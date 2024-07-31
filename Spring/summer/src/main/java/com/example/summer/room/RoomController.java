package com.example.summer.room;

import com.example.summer.room.dto.RoomRegisterReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoomController {
    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public String getAllRooms() {
        System.out.println(roomService.getAllRooms());
        return roomService.getAllRooms();
    }

    //    @RequestMapping(value = "/rooms", method = RequestMethod.POST)
//    public ResponseEntity<String> addRooms(@RequestBody RoomRequestDto roomRequestDto) {
//        return new ResponseEntity<>(roomService.addRooms(roomRequestDto), HttpStatus.CREATED);
//    }
    @PostMapping("/rooms")
    public void saveRoom(@RequestBody RoomRegisterReq roomRegisterReq) {
        roomService.saveRoom(roomRegisterReq);
    }


    @RequestMapping(value = "/rooms/{id}", method = RequestMethod.GET)
    public Room getRooms(@PathVariable int id) {
        return roomService.getRooms(id);
    }

}
