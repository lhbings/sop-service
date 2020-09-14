package com.example.sopservice.listener;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * description: TestConsumer
 * date: 2020/9/14 17:48
 * author: liuhuibin
 */
@Component
public class TestConsumer {

    @RabbitListener(queues = "test_queue")
    public void consume(Message message, Channel channel){
        System.out.printf("消费消息：{}"+message.toString());
        try {
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
