package com.anish.teams.dto;

public record ApiResponseDto(
    int statusCode,
    String statusMessage,
    String message,
    Object data
) { }
