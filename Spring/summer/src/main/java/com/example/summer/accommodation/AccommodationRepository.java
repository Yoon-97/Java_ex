package com.example.summer.accommodation;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AccommodationRepository {
    private Map<Integer, Accommodation> accommodationTable = new HashMap<>();
    private int accommodationIdx = 0;

    public AccommodationRepository(Map<Integer, Accommodation> accommodationTable) {
        this.accommodationTable = accommodationTable;
    }

    public Accommodation getProduct(int id) {
        return accommodationTable.get(id);
    }

    public Accommodation saveProduct(Accommodation accommodation) {
        accommodation.setId(accommodationIdx++);
        accommodationTable.put(accommodationIdx++, accommodation);
        return (getProduct(accommodationIdx - 1));
    }


}
