package com.example.backendextension.service;

import com.example.backendextension.dto.ReservationDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ReservationService {

    public List<ReservationDto> getAll() {
        return dummyData();
    }

    public List<ReservationDto> dummyData() {
        return Arrays.asList(
                new ReservationDto(1L, "Alice", 101L, "2025-01-01"),
                new ReservationDto(2L, "Bob", 102L, "2025-01-02")
        );
    }
}

