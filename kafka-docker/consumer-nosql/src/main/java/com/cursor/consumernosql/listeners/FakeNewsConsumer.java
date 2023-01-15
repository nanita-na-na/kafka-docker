package com.cursor.consumernosql.listeners;

import com.cursor.consumernosql.models.FakeNews;
import com.cursor.consumernosql.service.FakeNewsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static com.cursor.consumernosql.Constants.FAKE_NEWS_TOPIC;

@Component
@RequiredArgsConstructor
public class FakeNewsConsumer {

    private final FakeNewsService fakeNewsService;
    private final ObjectMapper objectMapper;

    @KafkaListener(topics = FAKE_NEWS_TOPIC, groupId = "group-id")
    public void consumeFakeNews(String message) throws JsonProcessingException {
        FakeNews fakeNews = objectMapper.readValue(message, FakeNews.class);
        System.out.println(fakeNews);
        fakeNewsService.save(fakeNews);
    }
}
