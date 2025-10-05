package com.yesh.activemq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yesh.activemq.producer.MessageProducer;

@RestController
public class MessageController {

	private final MessageProducer messageProducer;

	public MessageController(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

	@PostMapping("/send/{message}")
	public ResponseEntity<String> publishMessage(@PathVariable String message) {

		messageProducer.sendMessage(message);

		return ResponseEntity.ok("Message is Sent from end point is: " + message);

	}
}
