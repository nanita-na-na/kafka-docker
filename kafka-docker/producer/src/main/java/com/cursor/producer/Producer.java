package com.cursor.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import static com.cursor.producer.Constants.FAKE_NEWS_TOPIC;

@Component
@RequiredArgsConstructor
public class Producer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendFakeNews(String message) {
        kafkaTemplate.send(FAKE_NEWS_TOPIC, message);
    }
}
