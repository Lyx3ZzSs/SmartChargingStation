package com.sprixin.SmartChargeStation.demo.mqtt.FactoryMode.conf;

import lombok.Data;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mqtt")
@Data
public class MqttProps {
    private String host;
    private String clientIdFactoryMode;
    private String topic;
    private MqttConnectOptions options;
}