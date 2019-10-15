package com.wuzz.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 消息消费者
 *
 * @author wuzz
 * @date 9:24 2019/10/15
 */
@Component
public class JmsConsumer {

    @JmsListener(destination = "ActiveMQQueue")
    public void receiveQueue(String msg) {
        System.out.println(msg);
    }
}
