package com.yesh.activemq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yesh.activemq.model.Student;
import com.yesh.activemq.producer.MessageProducer;

@RestController
public class MessageController {

	private final MessageProducer messageProducer;

	public MessageController(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

	@PostMapping("/send")
	public ResponseEntity<Student> publishMessage(@RequestBody Student student) {

		messageProducer.sendMessage(student);

		return ResponseEntity.ok(student);

	}
}
