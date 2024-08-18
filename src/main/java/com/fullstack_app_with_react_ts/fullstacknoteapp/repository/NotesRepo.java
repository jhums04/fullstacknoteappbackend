package com.fullstack_app_with_react_ts.fullstacknoteapp.repository;

import com.fullstack_app_with_react_ts.fullstacknoteapp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepo extends JpaRepository<Note, Long> {
}
