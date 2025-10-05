package com.yesh.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;
import com.yesh.activemq.model.Student;

@Service
public class QueueConsumer {

    @JmsListener(destination = "Yeshwanth_Json_Queue")
    public void receiveFromQueue(Student student) {
        System.out.println("📩 Received from Queue: " + student);
    }
}
