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

	@PostMapping("/send/queue")
    public ResponseEntity<String> sendToQueue(@RequestBody Student student) {
		messageProducer.sendToQueue(student);
        return ResponseEntity.ok("Message sent to Queue successfully!");
    }

    @PostMapping("/send/topic")
    public ResponseEntity<String> sendToTopic(@RequestBody Student student) {
    	messageProducer.sendToTopic(student);
        return ResponseEntity.ok("Message sent to Topic successfully!");
    }
}
