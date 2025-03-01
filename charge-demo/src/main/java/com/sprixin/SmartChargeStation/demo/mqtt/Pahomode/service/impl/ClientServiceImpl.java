package com.sprixin.SmartChargeStation.demo.mqtt.Pahomode.service.impl;

import com.sprixin.SmartChargeStation.demo.mqtt.Pahomode.service.ClientService;
import com.sprixin.SmartChargeStation.demo.mqtt.Pahomode.utils.MqttClientUtils;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {


    @Resource
    private MqttClientUtils uitls;

    @Override
    public void publish(String topic,String message) {
        uitls.publish(topic,message);
    }

    @Override
    public void subScribe(String topic) {
        uitls.subScribe(topic);
    }

    @Override
    public void disconnect() {
        uitls.disconnct();
    }
}
