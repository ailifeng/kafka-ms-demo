package com.alf.kafkamsdemo;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(MetricBeatLogStreams.class)
public class MetricBeatLogStreamsConfig {
}
