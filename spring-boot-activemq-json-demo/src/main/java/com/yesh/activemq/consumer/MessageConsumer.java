package com.yesh.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.yesh.activemq.model.Student;

@Service
public class MessageConsumer {
	
	
	@JmsListener(destination="Yeshwanth_Json_Queue")
	public void receiveMessage(Student student) {
		System.out.println("Received Message is: "+student);
	}

}
