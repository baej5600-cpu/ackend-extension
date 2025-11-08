package com.example.backendextension.controller;

import com.example.backendextension.dto.ShareDto;
import com.example.backendextension.service.ShareService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/shares")
@Tag(name = "Shares", description = "Share APIs")
public class ShareController {

    private final ShareService shareService;

    public ShareController(ShareService shareService) {
        this.shareService = shareService;
    }

    @GetMapping
    @Operation(summary = "List shares")
    public List<ShareDto> getShares() {
        return shareService.getAll();
    }
}

