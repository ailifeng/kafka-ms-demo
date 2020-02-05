package com.alf.kafkamsdemo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MetricBeatLogStreams {
    String INPUT = "metricbeat-log-in";

    // read message
    @Input(INPUT)
    SubscribableChannel inboundMetricBeatLog();
}
