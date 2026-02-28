package com.anish.teams.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "teams.channel")
public record TeamsChannelProperties(
        String webhookUrl
) { }
