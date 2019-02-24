package ru.ldwx.notesjpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.ldwx.notesjpa.data.NotesRepository;

@Controller
@RequestMapping("/notes")
public class NoteController {

    private NotesRepository notesRepository;

    @Autowired
    public NoteController(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("notes", notesRepository.findAll());
        return "notes";
    }
}
