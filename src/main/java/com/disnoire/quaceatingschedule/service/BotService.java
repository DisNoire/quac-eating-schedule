package com.disnoire.quaceatingschedule.service;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.object.entity.channel.MessageChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BotService {

    @Autowired
    private GatewayDiscordClient discordClient;

    public void postMessage(String channelId, String message) {
        discordClient.getChannelById(Snowflake.of(channelId))
                .ofType(MessageChannel.class)
                .flatMap(channel -> channel.createMessage(message))
                .subscribe();
        log.info(String.format("Message {0} sent to channel {1}", message, channelId));
    }

}
