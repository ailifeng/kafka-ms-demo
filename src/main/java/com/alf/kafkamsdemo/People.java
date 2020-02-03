package com.alf.kafkamsdemo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class People {
    private long timestamp;
    private String name;
    private int age;
}
