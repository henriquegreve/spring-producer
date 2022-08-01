package com.greve.spring.producer.service;

import com.greve.spring.producer.dto.Message;

public interface AmqpService {
    void sendToConsumer(Message message);
}
