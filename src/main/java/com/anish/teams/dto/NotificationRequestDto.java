package com.anish.teams.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Schema(description =  "Request DTO for sending Teams channel notifications")
public record NotificationRequestDto(
    @NotBlank
    @Schema(description = "Title of the notification", example = "Server Down")
    String title,

    @NotBlank
    @Schema(description = "Subtitle of the notification", example = "Production Alert")
    String subtitle,

    @NotBlank
    @Schema(description = "Main content of the notification", example = "The production server is down since 2 PM")
    String content,

    @NotBlank
    @Schema(description = "Title of the action button", example = "View Details")
    String buttonTitle,

    @NotBlank
    @URL
    @Schema(description = "URL to be opened on button click", example = "https://www.google.com")
    String url
) { }
