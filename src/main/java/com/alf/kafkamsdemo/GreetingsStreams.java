package com.alf.kafkamsdemo;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface GreetingsStreams {
    String INPUT = "greetings-in";
    String OUTPUT = "greetings-out";

    // read message
    @Input(INPUT)
    SubscribableChannel inboundGreetings();

    // write message
    @Output(OUTPUT)
    MessageChannel outboundGreetings();
}
