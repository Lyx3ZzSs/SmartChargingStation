package com.sprixin.SmartChargeStation.demo;

import com.sprixin.SmartChargeStation.demo.mqtt.FactoryMode.conf.MqttProps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MqttProps.class)
public class MqttApplication {
    public static void main(String[] args) {
        SpringApplication.run(MqttApplication.class,args);
    }
}
