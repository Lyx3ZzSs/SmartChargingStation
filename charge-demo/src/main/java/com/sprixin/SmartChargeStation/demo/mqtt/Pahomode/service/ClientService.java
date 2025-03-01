package com.sprixin.SmartChargeStation.demo.mqtt.Pahomode.service;

/**
 * 业务类
 */
public interface ClientService {

    //发送
    public void publish(String topic,String message);

    //订阅
    public void subScribe(String topic);

    public void disconnect();
}
