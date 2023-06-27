package com.example.demo.produtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.stereotype.Component;

import static org.springframework.integration.support.MessageBuilder.withPayload;

@Component
@EnableBinding(Source.class)
public class RabbitMQProducer {

    @Autowired
    private Source source;

    public void sendMessage(String message) {
        source.output().send(withPayload(message).build());
        System.out.println("Mensagem enviada: " + message);
    }
}
