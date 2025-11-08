package com.example.backendextension.service;

import com.example.backendextension.dto.PlaceDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PlaceService {

    public List<PlaceDto> getAll() {
        return dummyData();
    }

    public List<PlaceDto> dummyData() {
        return Arrays.asList(
                new PlaceDto(101L, "Central Park", "New York, NY"),
                new PlaceDto(102L, "Eiffel Tower", "Paris, France")
        );
    }
}

