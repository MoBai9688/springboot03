package com.offcn.demo.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;

@Configuration // xml
public class MqConfig {

    //定义存放消息的队列
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("offcn_abcd");
    }

    //定义存放消息的队列
    @Bean
    public Topic topic() {
        return  new ActiveMQTopic("offcn_abcd666");
    }

//    <bean id="deleteDataFromSolrQueue" class="org.apache.activemq.command.ActiveMQTopic">
//        <constructor-arg value="deleteDataFromSolrQueue" />
//    </bean>

}
