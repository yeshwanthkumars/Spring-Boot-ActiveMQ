package com.yesh.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
	
	
	@JmsListener(destination="Yeshwanth_Queue")
	public void receiveMessage(String message) {
		System.out.println("Received Message is: "+message);
	}

}
