package com.wuzz.service;


import javax.jms.Queue;
import javax.jms.Topic;

/**
 * 生成者接口
 *
 * @author wuzz
 * @date 10:49 2019/10/18
 */
public interface ProducerService {

    /**
     * 发送消息到指定队列
     *
     * @param queueName
     * @param msg
     * @Author: wuzz
     * @Date 2019/10/18 10:57
     */
    void sendQueueMsg(String queueName, String msg);

    /**
     * 发送消息到默认队列
     *
     * @param msg
     * @Author: wuzz
     * @Date 2019/10/18 10:58
     */
    void sendQueueMsg(String msg);

    /**
     * 发送消息到指定主题
     *
     * @param topicName
     * @param msg
     * @Author: wuzz
     * @Date 2019/10/18 10:57
     */
    void sendTopicMsg(String topicName, String msg);

    /**
     * 发送消息到默认主题
     *
     * @param msg
     * @Author: wuzz
     * @Date 2019/10/18 10:58
     */
    void sendTopicMsg(String msg);
}
