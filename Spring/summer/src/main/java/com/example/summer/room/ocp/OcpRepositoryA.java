package com.example.summer.room.ocp;

import org.springframework.stereotype.Repository;

@Repository
public class OcpRepositoryA implements OcpRepository {
    public void save() {
        System.out.println("A로 저장");
    }
}
