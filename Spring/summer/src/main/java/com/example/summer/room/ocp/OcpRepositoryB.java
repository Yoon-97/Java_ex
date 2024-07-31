package com.example.summer.room.ocp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class OcpRepositoryB implements OcpRepository {
    public void save() {
        System.out.println("B로 저장");
    }
}
