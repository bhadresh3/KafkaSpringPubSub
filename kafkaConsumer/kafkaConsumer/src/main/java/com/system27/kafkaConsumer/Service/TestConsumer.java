package com.system27.kafkaConsumer.Service;

import com.system27.kafkaConsumer.Model.Person;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;


@Service
public class TestConsumer {

    @KafkaListener(topics = "test", groupId = "group1")
    public void consumeObj(@Payload Person person){
        System.out.println("Person Listener called");
        System.out.println(person.toString());
    }

}


/*
bhadresh3

System27
 */