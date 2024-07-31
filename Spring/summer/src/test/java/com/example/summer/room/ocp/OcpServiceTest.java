package com.example.summer.room.ocp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OcpServiceTest {
    @Autowired
    OcpService ocpService;

    @Test
    public void testOcpService() {
        ocpService.save();
    }
}