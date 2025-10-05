package com.yesh.activemq.producer;


import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.yesh.activemq.model.Order;

@Component
public class OrderProducer {

    private final JmsTemplate jmsTemplate;

    public OrderProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendOrder(Order order) {
        jmsTemplate.convertAndSend("Order_Queue", order);
    }
}

