package com.fullstack_app_with_react_ts.fullstacknoteapp.controller;

import com.fullstack_app_with_react_ts.fullstacknoteapp.dto.Notesdto;
import com.fullstack_app_with_react_ts.fullstacknoteapp.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/note")
public class NotesController {

    private final NoteService notesService;


    @Autowired
    public NotesController(NoteService notesService) {
        this.notesService = notesService;
    }

    @GetMapping("/get-all")
    public List<Notesdto> getAllNotes() {
        return notesService.getNotes();
    }

    @PostMapping
    @ResponseBody
    public Notesdto notesdto(@RequestBody Notesdto notesdto) {
        return notesService.save(notesdto);
    }

    @DeleteMapping("/{id}")
    public List<Notesdto> deleteNote(@PathVariable Long id) {
        return notesService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Notesdto findById(@PathVariable Long id) {
        return notesService.findById(id);
    }


}
