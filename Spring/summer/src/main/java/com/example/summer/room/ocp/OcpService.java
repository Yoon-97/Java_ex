package com.example.summer.room.ocp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OcpService {

    OcpRepository ocpRepository;

    @Autowired
    public OcpService(OcpRepository ocpRepository) {
        this.ocpRepository = ocpRepository;
    }


    public void save() {
        ocpRepository.save();
    }
}
