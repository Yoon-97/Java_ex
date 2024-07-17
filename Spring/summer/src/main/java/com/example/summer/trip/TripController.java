package com.example.summer.trip;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @Controller로 하면 에러. 왜냐면 view를 반환하기 때문에
// @RestController는 데이터만 반환해준다.
public class TripController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "hi spring";
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String productTest() {
        return "여기는 상품 페이지란";
    }
}
