package com.xgd.mqttdemo.pojo;

import lombok.Data;

/**
 * class
 *
 * @author yanyue
 * @date 2023.2.21
 */
@Data
public class MqttMsg {
    private static final long serialVersionUID = 1L;

    private String topic;
    private String content;
    private int qos;
}
