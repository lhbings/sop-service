package com.example.sopservice.service.impl;

import com.example.sopservice.service.TestMqService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description: TestMqServiceImpl
 * date: 2020/9/14 18:03
 * author: liuhuibin
 */
@Service
public class TestMqServiceImpl implements TestMqService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void send() {
         rabbitTemplate.convertAndSend("test_direct_exchange","test_router_key","hello,world");
    }
}
