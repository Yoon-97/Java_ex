package com.example.summer.accommodation;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class AccommodationRepository {
    private Map<Integer, Accommodation> accommodationTable = new HashMap<>();
    private int accommodationIdx = 0;

    public AccommodationRepository(Map<Integer, Accommodation> accommodationTable) {
        this.accommodationTable = accommodationTable;
    }

    public Optional<Accommodation> getAccommodation(int id) {
        Optional<Accommodation> foundedAccommodation = Optional.ofNullable(accommodationTable.get(id));
        return foundedAccommodation;
    }

    public Accommodation saveProduct(Accommodation accommodation) {
        accommodation.setId(accommodationIdx++);
        accommodationTable.put(accommodationIdx++, accommodation);
        return accommodation;
    }


}
