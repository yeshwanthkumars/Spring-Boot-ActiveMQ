package com.yesh.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;
import com.yesh.activemq.model.Student;

@Service
public class TopicConsumer {

    @JmsListener(destination = "Yeshwanth_Json_Topic", containerFactory = "topicListenerFactory")
    public void receiveFromTopic(Student student) {
        System.out.println("Received from Topic: " + student);
    }
}
