package com.RabbitMq.receptor.RabbitMq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue ReceptQueue() {
        return new Queue("Recept");
    }
}
