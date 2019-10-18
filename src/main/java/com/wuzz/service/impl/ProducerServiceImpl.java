package com.wuzz.service.impl;

import com.wuzz.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * 生产者接口实现
 *
 * @author wuzz
 * @date 10:49 2019/10/18
 */
@Service
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${spring.activemq.queueName}")
    String queueName;
    @Value("${spring.activemq.topicName}")
    String topicName;

    @Override
    public void sendQueueMsg(String queue, String msg) {
        jmsTemplate.convertAndSend(queue, msg);
    }

    @Override
    public void sendQueueMsg(String msg) {
        jmsTemplate.convertAndSend(queueName, msg);
    }

    @Override
    public void sendTopicMsg(String topic, String msg) {
        jmsTemplate.convertAndSend(topic, msg);
    }

    @Override
    public void sendTopicMsg(String msg) {
        jmsTemplate.convertAndSend(topicName, msg);
    }
}
