package com.example.summer.core;

import lombok.Getter;

@Getter
public class House {
    private String name;

    public House() {
        this.name = "A House";
        System.out.println("집이 생성되었다");
    }

    public House(String name) {
        this.name = name;
        System.out.println("이름 있는 집이 생성되었다");
    }
    
}
