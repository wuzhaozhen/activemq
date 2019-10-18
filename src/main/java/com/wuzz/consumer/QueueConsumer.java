package com.wuzz.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 队列消息消费者
 *
 * @author wuzz
 * @date 11:18 2019/10/18
 */
@Component
public class QueueConsumer {

    @JmsListener(destination = "testQueue")
    public void receiveQueue(String text) {
        System.out.println("消费者：来源于生产者的消息：" + text);
    }
}
