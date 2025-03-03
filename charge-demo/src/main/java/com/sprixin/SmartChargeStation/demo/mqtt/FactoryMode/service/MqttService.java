package com.sprixin.SmartChargeStation.demo.mqtt.FactoryMode.service;

import com.sprixin.SmartChargeStation.demo.mqtt.FactoryMode.model.MqttConstants;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;


/**
 * @MessagingGateway注解的作用就是:
 * 拦截发送的mqtt消息，然后投放到消息通道
 *
 * 由于@MessagingGateway注解属于org.springframework.integration.annotation 这个包下
 * 启动无法扫描到
 * 所以使用@IntegrationComponentScan注解让启动类扫描到@MessagingGateway注解
 */
@IntegrationComponentScan
@MessagingGateway(defaultRequestChannel = MqttConstants.OUT_CHANNEL)
public interface MqttService {

    /* **********************
     *
     * 注意：
     * topic这个参数，
     * 必须使用@Header(MqttHeaders.TOPIC)修饰
     * 视频没有讲解这个
     *
     * *********************/

    //发送消息
    void send(@Header(MqttHeaders.TOPIC)String topic, String message);
}
