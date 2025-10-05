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

	public void sendMessage(Student student) {
		jmsTemplate.convertAndSend("Yeshwanth_Json_Queue", student);
	}


}
