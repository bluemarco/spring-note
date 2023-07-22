package io.bluemarco.note.payload;

import java.util.Date;

public record NewNotePayload(
        String title,
        String content
) {}
