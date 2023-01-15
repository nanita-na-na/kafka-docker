package com.cursor.producer.web;

import com.cursor.producer.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/news")
@RequiredArgsConstructor
public class NewsController {

    private final Producer producer;

    @PostMapping
    public void postNews(@RequestBody String message) {
        producer.sendFakeNews(message);
    }
}
