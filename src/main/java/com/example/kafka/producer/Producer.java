package com.example.kafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Producer {

    private final StreamBridge streamBridge;

    public void sendMessageBySpringCloud(String payload) {
        streamBridge.send("nahyun", payload);
    }
}
