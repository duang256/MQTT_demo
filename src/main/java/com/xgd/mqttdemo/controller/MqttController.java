package com.xgd.mqttdemo.controller;


import com.xgd.mqttdemo.dateway.MqttGateway;
import com.xgd.mqttdemo.pojo.MqttMsg;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *MqttController class
 *
 * @author yanyue
 * @date 2023.2.21
 */
@RestController
public class MqttController {
    @Resource
    private MqttGateway mqttGateway;

    @PostMapping("/send")
    public String send(@RequestBody MqttMsg myMessage) {
        // 发送消息到指定主题
        mqttGateway.sendToMqtt(myMessage.getTopic(), 1, myMessage.getContent());
        return "send topic: " + myMessage.getTopic()+ ", message : " + myMessage.getContent();
    }
}
