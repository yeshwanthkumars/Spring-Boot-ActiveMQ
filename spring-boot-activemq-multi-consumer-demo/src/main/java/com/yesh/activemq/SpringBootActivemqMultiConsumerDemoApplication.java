package com.yesh.activemq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yesh.activemq.model.Order;
import com.yesh.activemq.producer.OrderProducer;

@SpringBootApplication
public class SpringBootActivemqMultiConsumerDemoApplication implements CommandLineRunner {

    private final OrderProducer producer;

    public SpringBootActivemqMultiConsumerDemoApplication(OrderProducer producer) {
        this.producer = producer;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootActivemqMultiConsumerDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Simulate placing orders
        producer.sendOrder(new Order("ORD001", "Laptop", 2));
        producer.sendOrder(new Order("ORD002", "Mobile", 5));
        producer.sendOrder(new Order("ORD003", "Keyboard", 10));
        producer.sendOrder(new Order("ORD004", "Mouse", 15));
        producer.sendOrder(new Order("ORD005", "Monitor", 3));
    }
}
