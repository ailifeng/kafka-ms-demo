package com.alf.kafkamsdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PeopleListener {
    @StreamListener(PeopleStreams.INPUT)
    public void handlePeople(Message<?> message) {
        Acknowledgment acknowledgment = message.getHeaders().get(KafkaHeaders.ACKNOWLEDGMENT, Acknowledgment.class);
        /*
         */

        if (acknowledgment != null) {
            log.info("acknowledge provided");
            log.info("receive message: {}", message.getPayload().toString());
           // acknowledgment.acknowledge();
        } else {
            log.info("null acklowdge");
        }
    }

    /*
    @StreamListener(PeopleStreams.INPUT)
    public void handlePeople(@Payload People people) {
        log.info("Received people: {}", people);
    }
     */
}
