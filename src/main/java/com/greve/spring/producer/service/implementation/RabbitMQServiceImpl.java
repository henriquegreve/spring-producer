package com.greve.spring.producer.service.implementation;

import com.greve.spring.producer.amqp.AmqpProducer;
import com.greve.spring.producer.dto.Message;
import com.greve.spring.producer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl implements AmqpService {

    @Autowired
    private AmqpProducer<Message> amqp;

    @Override
    public void sendToConsumer(Message message) {
        amqp.producer(message);
    }
}
