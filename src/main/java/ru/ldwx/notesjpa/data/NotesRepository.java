package ru.ldwx.notesjpa.data;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ldwx.notesjpa.Note;

public interface NotesRepository extends JpaRepository<Note, Long> {
}
