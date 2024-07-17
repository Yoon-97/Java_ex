package com.example.summer.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private House house;

    @Autowired
    public Person(House house) {
        this.house = house;
        System.out.println(house.getName() + " 라는 집을 샀다");
    }
}
