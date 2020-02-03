package com.alf.kafkamsdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class PeopleService {
    private final PeopleStreams peopleStreams;

    public PeopleService(PeopleStreams peopleStream) {
        this.peopleStreams = peopleStream;
    }

    public void sendPeople(final People people) {
        log.info("Sending people {}", people);

        MessageChannel messageChannel = peopleStreams.outboundPeople();
        messageChannel.send(MessageBuilder
                .withPayload(people)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}
