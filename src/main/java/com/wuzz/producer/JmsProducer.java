package com.wuzz.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * 消息生产者
 *
 * @author wuzz
 * @date 9:30 2019/10/15
 */
@Component
public class JmsProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    /**
     * 发送通知给指定队列
     *
     * @param destination 消息队列名称
     * @param message     消息内容
     * @Author: wuzz
     * @Date 2019/10/15 9:31
     */
    public void sendMsg(String destination, String message) {
        jmsTemplate.convertAndSend(destination, message);
    }
}
