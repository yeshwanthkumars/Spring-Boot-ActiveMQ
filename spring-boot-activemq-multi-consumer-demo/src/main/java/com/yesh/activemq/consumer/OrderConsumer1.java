package com.yesh.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.yesh.activemq.model.Order;

@Component
public class OrderConsumer1 {

    @JmsListener(destination = "Order_Queue")
    public void receiveOrder(Order order) {
        System.out.println("[Consumer 1] Processing order: " + order);
    }
}
