package com.example.sopservice.config;

import lombok.Data;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.Map;

/**
 * description: RabbitMqConfig
 * date: 2020/9/14 17:01
 * author: liuhuibin
 */
@Configuration
@Data
public class RabbitMqConfig {


    @Bean
    public Queue testQueue() {
        return new Queue("test_queue", true);
    }

    @Bean
    public DirectExchange testDirectExchange() {
        return new DirectExchange("test_direct_exchange",true,false);
    }

    @Bean
    public Binding testBinding(DirectExchange testDirectExchange,Queue testQueue){
        return BindingBuilder.bind(testQueue).to(testDirectExchange).with("test_router_key");
    }

}
