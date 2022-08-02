package com.disnoire.quaceatingschedule.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageScheduleService {

    @Value("${channelId}")
    private String channelId;

    @Value("${message}")
    private String message;

    @Autowired
    private BotService botService;

    @Scheduled(cron = "${cron.expression}", zone = "${cron.zone}")
    private void postMessageOnTime() {
        botService.postMessage(channelId, message);
    }
}
