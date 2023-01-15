package com.cursor.consumernosql.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("sport-news")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FakeNews {

    @Id
    private String id;

    private String title;
    private String description;


}
