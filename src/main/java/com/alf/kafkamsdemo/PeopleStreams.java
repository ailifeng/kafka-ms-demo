package com.alf.kafkamsdemo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface PeopleStreams {
    String INPUT = "people-in";
    String OUTPUT = "people-out";

    // read message
    @Input(INPUT)
    SubscribableChannel inboundPeople();

    // write message
    @Output(OUTPUT)
    MessageChannel outboundPeople();
}
