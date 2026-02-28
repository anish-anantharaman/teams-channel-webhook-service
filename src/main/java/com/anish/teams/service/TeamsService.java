package com.anish.teams.service;

import com.anish.teams.dto.NotificationRequestDto;

import java.util.concurrent.CompletableFuture;

public interface TeamsService {

    CompletableFuture<Void> sendChannelNotification(NotificationRequestDto request);

}
