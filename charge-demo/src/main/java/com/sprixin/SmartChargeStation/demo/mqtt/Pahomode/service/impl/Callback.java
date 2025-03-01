package com.sprixin.SmartChargeStation.demo.mqtt.Pahomode.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.stereotype.Service;

@Slf4j
public class Callback implements MqttCallback {

    /**
     * 连接丢失调用的方法
     *
     * @param throwable 异常
     */
    @Override
    public void connectionLost(Throwable throwable) {
        log.info(">>>>>连接断开，原因：" + throwable.getMessage());
    }

    /**
     * 接收到订阅的消息后调用
     *
     * @param topic
     * @param mqttMessage
     * @throws Exception
     */
    @Override
    public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
        log.info(">>>>>接收主题" + topic + "的消息：" + mqttMessage.toString());
    }

    /**
     * 发送成功调用的方法
     *
     * @param iMqttDeliveryToken
     */
    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        log.info(">>>>>消息发送是否成功：" + iMqttDeliveryToken.isComplete());
    }
}
