package com.cursor.consumernosql.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.cursor.consumernosql.Constants.FAKE_NEWS_TOPIC;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic fakeNews() {
        return TopicBuilder.name(FAKE_NEWS_TOPIC).build();
    }
}
