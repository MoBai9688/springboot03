package com.offcn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.*;

@RestController
public class MqController {

    @Autowired
    JmsTemplate jmsTemplate;
    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;


    @Autowired
    Queue queue;
    @Autowired
    Topic topic;

//    Destination queue;
//    Destination topic;

    @GetMapping("/send")
    public String send(){
        jmsTemplate.send(queue, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage hello = session.createTextMessage("hello");
                return hello;
            }
        });
//        jmsMessagingTemplate.convertAndSend(queue, "hello");
        return "ok";
    }

    @GetMapping("/send3")
    public String sendToQueue(String message){
//        jmsMessagingTemplate.convertAndSend(topic,"hello mq springboot");
        jmsMessagingTemplate.convertAndSend(queue,message);
        return "ok";
    }

}
