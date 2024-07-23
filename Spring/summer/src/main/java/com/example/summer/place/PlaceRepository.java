package com.example.summer.place;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PlaceRepository {
    private Map<Integer, Place> placeTable = new HashMap<>();
    private int idx = 0;

    public PlaceRepository(Map<Integer, Place> placeTable) {
        this.placeTable = placeTable;
    }

    public Place getPlace(int id) {
        Place place = placeTable.get(id);
        return place;
    }

    public String savePlace(Place place) {
        placeTable.put(idx++, place);
        return (getPlace(idx - 1).getName() + " 이 정상적으로 추가되었습니다.");
    }
}
