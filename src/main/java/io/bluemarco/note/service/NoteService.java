package io.bluemarco.note.service;

import io.bluemarco.note.collection.Note;
import io.bluemarco.note.repository.NoteRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private  NoteRepositoryImpl noteRepository;

    public void addNew(Note note){
        noteRepository.addNew(note);
    }

    public List<Note> getAll(){
        return noteRepository.getAll();
    }

    public void delete(String ID){
        noteRepository.deleteByID(ID);
    }
}
