package com.example.summer.accommodation;

import com.example.summer.exception.AccommodationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccommodationService {
    AccommodationRepository accommodationRepository;

    @Autowired
    public AccommodationService(AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    public Accommodation getAccommodation(int id) {
        return accommodationRepository.getAccommodation(id).orElseThrow(
                () -> new AccommodationNotFoundException("No Accommodation Found: ")
        );
    }

    public String getAccommodationName(int id) {

        Accommodation foundedAccommodation = accommodationRepository.getAccommodation(id).orElseThrow(() -> new AccommodationNotFoundException("No Accommodation: "));
        return foundedAccommodation.getName();
    }

    public Accommodation addAccommodation(Accommodation accommodation) {
        return accommodationRepository.saveProduct(accommodation);
    }

}
