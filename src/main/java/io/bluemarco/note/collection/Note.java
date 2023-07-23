package io.bluemarco.note.collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "notes")
public record Note(
        @Id
        String id,
        String title,
        String content,
        Date creationDate
) {}
