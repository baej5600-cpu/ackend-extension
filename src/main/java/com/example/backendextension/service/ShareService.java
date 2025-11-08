package com.example.backendextension.service;

import com.example.backendextension.dto.ShareDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ShareService {

    public List<ShareDto> getAll() {
        return dummyData();
    }

    public List<ShareDto> dummyData() {
        return Arrays.asList(
                new ShareDto(1L, "Spring Tips", "https://example.com/spring-tips"),
                new ShareDto(2L, "Travel Guide", "https://example.com/travel-guide")
        );
    }
}

