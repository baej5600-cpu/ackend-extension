package com.example.backendextension.service;

import com.example.backendextension.dto.ReviewDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ReviewService {

    public List<ReviewDto> getAll() {
        return dummyData();
    }

    public List<ReviewDto> dummyData() {
        return Arrays.asList(
                new ReviewDto(1L, 101L, 5, "Great place!"),
                new ReviewDto(2L, 102L, 4, "Nice view.")
        );
    }
}

