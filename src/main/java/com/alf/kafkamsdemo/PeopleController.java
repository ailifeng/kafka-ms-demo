package com.alf.kafkamsdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {
    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/people")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void writePeople(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        People people = People.builder()
                .name(name)
                .age(age)
                .timestamp(System.currentTimeMillis())
                .build();
        peopleService.sendPeople(people);
    }
}
