package io.bluemarco.note.model;

import java.util.Date;
import java.util.UUID;

public record Note(
        UUID id,
        String title,
        String content,
        Date creationDate
) {}
