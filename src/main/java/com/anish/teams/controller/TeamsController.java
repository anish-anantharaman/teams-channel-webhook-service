package com.anish.teams.controller;

import com.anish.teams.dto.ApiResponseDto;
import com.anish.teams.dto.NotificationRequestDto;
import com.anish.teams.service.TeamsService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/notifications")
public class TeamsController {

    private final TeamsService teamsService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> sendChannelNotification(
            @Valid @RequestBody NotificationRequestDto requestDto) {

        teamsService.sendChannelNotification(requestDto);

        ApiResponseDto response = new ApiResponseDto(
                HttpStatus.ACCEPTED.value(),
                HttpStatus.ACCEPTED.getReasonPhrase(),
                "Notification queued successfully",
                Boolean.TRUE
        );
        return ResponseEntity.accepted().body(response);
    }
}
