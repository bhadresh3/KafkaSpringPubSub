package com.system27.kafkaProducer.Controller;

import com.system27.kafkaProducer.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    KafkaTemplate<String, Person> personKafkaTemplate;

    private static final String TOPIC = "test";

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createPerson(@RequestBody Person person){
        personKafkaTemplate.send(TOPIC, person);
        return "Success";
    }
}
