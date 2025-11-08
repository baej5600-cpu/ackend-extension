package com.example.backendextension.controller;

import com.example.backendextension.dto.PlaceDto;
import com.example.backendextension.service.PlaceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/places")
@Tag(name = "Places", description = "Place APIs")
public class PlaceController {

    private final PlaceService placeService;

    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping
    @Operation(summary = "List places")
    public List<PlaceDto> getPlaces() {
        return placeService.getAll();
    }
}

