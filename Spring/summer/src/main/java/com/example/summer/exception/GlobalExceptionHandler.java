package com.example.summer.exception;

import com.example.summer.room.Room;
import com.example.summer.room.dto.RoomRegisterReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice // 모든 컨트롤러 에서 예외 발생시 인터셉트
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RoomNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Room catchRoomNotFoundException(RoomNotFoundException e) {
        log.error("Exception class 에러: {}", e.getClass());
        System.out.println(e.getMessage() + "방이 존재하지 않습니다.");
        e.printStackTrace();
        return new RoomRegisterReq().toRoom();
    }

    @ExceptionHandler(value = AccommodationNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String catchAccommodationNotFoundException(AccommodationNotFoundException e) {
        log.error("Exception class 에러: {}", e.getClass());
        System.out.println(e.getMessage() + "숙박업소가 존재하지 않습니다.");
        e.printStackTrace();
        return "없지롱";
    }
}
