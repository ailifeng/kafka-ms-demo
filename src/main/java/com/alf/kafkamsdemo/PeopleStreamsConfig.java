package com.alf.kafkamsdemo;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(PeopleStreams.class)
public class PeopleStreamsConfig {
}
