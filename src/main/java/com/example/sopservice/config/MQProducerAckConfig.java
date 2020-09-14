package com.example.sopservice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.utils.SerializationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * description: rabbitmq 消息回调Config
 * date: 2020/9/14 16:47
 * author: liuhuibin
 */
@Configuration
public class MQProducerAckConfig  implements RabbitTemplate.ConfirmCallback , RabbitTemplate.ReturnCallback {

    public static final Logger logger = LoggerFactory.getLogger(MQProducerAckConfig.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void init(){
        rabbitTemplate.setConfirmCallback(this::confirm);
        rabbitTemplate.setReturnCallback(this::returnedMessage);
    }


    /*
     * confirm回调,true代表消息到达broker,false代表消息异常未到broker
     * */
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        if (ack) {
            System.out.println("消息发送成功" + correlationData);
        } else {
            System.out.println("消息发送失败:" + cause);
        }
    }

    /*
     * return回调，消息入队列失败后才会触发
     * */
    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        // 反序列化对象输出
        System.out.println("消息主体: " + SerializationUtils.deserialize(message.getBody()));
        System.out.println("应答码: " + replyCode);
        System.out.println("描述：" + replyText);
        System.out.println("消息使用的交换器 exchange : " + exchange);
        System.out.println("消息使用的路由键 routing : " + routingKey);
    }
}
