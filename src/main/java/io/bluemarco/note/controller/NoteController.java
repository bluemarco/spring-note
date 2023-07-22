package io.bluemarco.note.controller;

import io.bluemarco.note.collection.Note;
import io.bluemarco.note.payload.NewNotePayload;
import io.bluemarco.note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("notes")
@CrossOrigin
public class NoteController {

    @Autowired
    private  NoteService noteService;

    @PostMapping("/add")
    public ResponseEntity<String> addNew(@RequestBody NewNotePayload newNote){
        Note note = new Note(
                UUID.randomUUID().toString(),
                newNote.title(),
                newNote.content(),
                Date.from(Instant.now())
        );
        noteService.addNew(note);
        return ResponseEntity.ok("");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Note>> getAllNotes(){
        return ResponseEntity.ok(noteService.getAll());
    }

    @GetMapping("/delete/{id}")
    public void deleteNote(@PathVariable("id") String ID){
        noteService.delete(ID);
    }
}
