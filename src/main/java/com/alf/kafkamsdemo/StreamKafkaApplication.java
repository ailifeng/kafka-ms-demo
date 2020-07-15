package com.alf.kafkamsdemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Consumer;
import java.util.function.Function;

@SpringBootApplication
public class StreamKafkaApplication {
    private final Log logger = LogFactory.getLog(getClass());
    public static void main(String[] args) {
        SpringApplication.run(StreamKafkaApplication.class, args);
    }
}

