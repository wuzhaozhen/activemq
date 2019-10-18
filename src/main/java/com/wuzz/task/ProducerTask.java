package com.wuzz.task;

import com.wuzz.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时发送消息
 *
 * @author wuzz
 * @date 11:20 2019/10/18
 */
@Configuration
public class ProducerTask {

    @Autowired
    ProducerService producerService;

    @Scheduled(fixedRate = 5000, initialDelay = 3000)
    public void send() {
        //发送队列消息
        producerService.sendQueueMsg("生产者辛苦生产的点对点消息成果");
        System.out.println("生产者：辛苦生产的点对点消息成果");
        //发送订阅消息
        this.producerService.sendTopicMsg("生产者辛苦生产的订阅/发布消息成果");
        System.out.println("生产者：辛苦生产的订阅/发布消息成果");

    }
}
