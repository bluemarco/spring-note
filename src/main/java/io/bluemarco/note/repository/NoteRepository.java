package io.bluemarco.note.repository;

import io.bluemarco.note.collection.Note;

import java.util.List;

public interface NoteRepository {
    void addNew(Note note);
    void deleteByID(String ID);
    List<Note> getAll();

}
