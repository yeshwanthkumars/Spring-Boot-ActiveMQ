package com.yesh.activemq.producer;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.yesh.activemq.model.Student;


@Service
public class MessageProducer {
	
	private final JmsTemplate jmsTemplate;

	public MessageProducer(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void sendToQueue(Student student) {
        jmsTemplate.convertAndSend("Yeshwanth_Json_Queue", student);
        System.out.println("Sent to Queue: " + student);
    }

    public void sendToTopic(Student student) {
        jmsTemplate.convertAndSend("Yeshwanth_Json_Topic", student);
        System.out.println("Sent to Topic: " + student);
    }

}
