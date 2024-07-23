package com.example.summer.place;

import org.springframework.stereotype.Service;

@Service
public class PlaceService {
    private final PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public String addPlace(Place place) {
        return placeRepository.savePlace(place);
    }
}
