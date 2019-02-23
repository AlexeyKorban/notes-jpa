package ru.ldwx.notesjpa.data;

import org.springframework.data.repository.CrudRepository;
import ru.ldwx.notesjpa.Note;

public interface NotesRepository extends CrudRepository<Note, Long> {
}
