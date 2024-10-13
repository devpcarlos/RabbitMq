package com.RabbitMq.receptor;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReceptorListener {

    @RabbitListener(queues = "Emisor")
    public void handle(String message){
        System.out.println(message);
    }

}
