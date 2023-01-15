package com.cursor.consumernosql.repository;

import com.cursor.consumernosql.models.FakeNews;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FakeNewsRepository extends MongoRepository<FakeNews, String> {
}
