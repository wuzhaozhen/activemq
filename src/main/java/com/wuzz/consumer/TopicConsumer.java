package com.wuzz.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 主题消费者
 *
 * @author wuzz
 * @date 11:18 2019/10/18
 */
@Component
public class TopicConsumer {

    @JmsListener(destination = "testTopic")
    public void receiveSub1(String text) {
        System.out.println("消费者：Consumer1=" + text);

    }

    @JmsListener(destination = "testTopic")
    public void receiveSub2(String text) {
        System.out.println("消费者：Consumer2=" + text);
    }
}
