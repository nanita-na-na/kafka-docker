package com.cursor.consumersql.service.impl;

import com.cursor.consumersql.models.FakeNews;
import com.cursor.consumersql.repository.FakeNewsRepository;
import com.cursor.consumersql.service.FakeNewsService;
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
