package com.alf.kafkamsdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MetricBeatLogListener {
    @StreamListener(MetricBeatLogStreams.INPUT)
    public void handleMetricBeatLog(Message<?> message) {
        Acknowledgment acknowledgment = message.getHeaders().get(KafkaHeaders.ACKNOWLEDGMENT, Acknowledgment.class);

        if (acknowledgment != null) {
            log.info("receive metric beat log:\n {}", message.getPayload().toString());
            acknowledgment.acknowledge();
        } else {
            log.info("null ackknowledge");
        }
    }

}
