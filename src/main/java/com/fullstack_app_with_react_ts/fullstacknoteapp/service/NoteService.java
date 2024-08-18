package com.fullstack_app_with_react_ts.fullstacknoteapp.service;

import com.fullstack_app_with_react_ts.fullstacknoteapp.dto.Notesdto;
import com.fullstack_app_with_react_ts.fullstacknoteapp.entity.Note;
import com.fullstack_app_with_react_ts.fullstacknoteapp.repository.NotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class NoteService {

    private final NotesRepo notesRepo;

    @Autowired
    public NoteService(NotesRepo notesRepo) {
        this.notesRepo = notesRepo;
    }

    public List<Notesdto> getNotes() {
        return notesRepo.findAll().isEmpty()
                ? Collections.emptyList()
                : notesRepo.findAll()
                .stream()
                .map(note -> {
                    return new Notesdto(note.getId(), note.getContent());
                })
                .toList();
    }

    public Notesdto save(Notesdto notesdto) {
        Note newNote = new Note();
        newNote.setContent(notesdto.getContent());
        Note savedNote = notesRepo.save(newNote);
        return new Notesdto(savedNote.getId(), savedNote.getContent());
    }
}
