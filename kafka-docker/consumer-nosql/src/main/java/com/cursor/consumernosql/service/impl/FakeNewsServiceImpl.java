package com.cursor.consumernosql.service.impl;

import com.cursor.consumernosql.models.FakeNews;
import com.cursor.consumernosql.repository.FakeNewsRepository;
import com.cursor.consumernosql.service.FakeNewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class FakeNewsServiceImpl implements FakeNewsService {

    private final FakeNewsRepository fakeNewsRepository;

    @Override
    public void save(FakeNews fakeNews) {
        fakeNewsRepository.save(fakeNews);
    }
}
