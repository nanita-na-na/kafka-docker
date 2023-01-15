package com.cursor.consumersql.repository;

import com.cursor.consumersql.models.FakeNews;
import org.springframework.data.repository.CrudRepository;

public interface FakeNewsRepository extends CrudRepository<FakeNews, Long> {
}
