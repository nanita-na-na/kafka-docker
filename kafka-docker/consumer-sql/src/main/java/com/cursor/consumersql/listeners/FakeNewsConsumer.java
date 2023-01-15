package com.cursor.consumersql.listeners;

import com.cursor.consumersql.Constants;
import com.cursor.consumersql.models.FakeNews;
import com.cursor.consumersql.service.FakeNewsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FakeNewsConsumer {
    private final FakeNewsService fakeNewsService;
    private final ObjectMapper objectMapper;


    @KafkaListener(topics = Constants.FAKE_NEWS_TOPIC, groupId = "group-id")
    public void consumerFakeNews(String message) throws JsonProcessingException {
        FakeNews fakeNews = objectMapper.readValue(message, FakeNews.class);

        System.out.println(fakeNews);
        fakeNewsService.save(fakeNews);
    }
}
