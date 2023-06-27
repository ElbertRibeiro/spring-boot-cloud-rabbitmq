package com.example.demo.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class RabbitMQConsumer {

    @StreamListener(Sink.INPUT)
    public void receiveMessage(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
}
