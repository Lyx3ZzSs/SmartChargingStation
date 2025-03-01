package com.sprixin.SmartChargeStation.demo.controller;

import com.sprixin.SmartChargeStation.demo.mqtt.Pahomode.service.impl.ClientServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqttPahoController {

    @Resource
    private ClientServiceImpl clientService;

    @RequestMapping("/paho/pub")
    public void pahoPub(String topic,String message) {
        clientService.publish(topic,message);
        clientService.disconnect();
    }

    @RequestMapping("/paho/sub")
    public void pahoSub(String topic) {
        clientService.subScribe(topic);
        clientService.disconnect();
    }
}
