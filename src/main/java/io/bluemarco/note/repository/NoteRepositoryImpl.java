package io.bluemarco.note.repository;

import io.bluemarco.note.collection.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NoteRepositoryImpl implements NoteRepository{

    @Autowired
    private  MongoTemplate mongo;


    @Override
    public void addNew(Note note) {
        mongo.save(note);
    }

    @Override
    public void deleteByID(String ID) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(ID));
        mongo.findAndRemove(query, Note.class);
    }

    @Override
    public List<Note> getAll() {
        return mongo.findAll(Note.class);
    }
}
