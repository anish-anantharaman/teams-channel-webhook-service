package com.anish.teams.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public record NotificationRequestDto(
    @NotBlank
    String title,

    @NotBlank
    String subtitle,

    @NotBlank
    String content,

    @NotBlank
    String buttonTitle,

    @NotBlank
    @URL
    String url
) { }
