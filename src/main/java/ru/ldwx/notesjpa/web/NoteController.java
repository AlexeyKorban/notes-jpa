package ru.ldwx.notesjpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.ldwx.notesjpa.Note;
import ru.ldwx.notesjpa.data.NotesRepository;

import java.util.Comparator;
import java.util.List;

@Controller
public class NoteController {

    private NotesRepository notesRepository;

    @Autowired
    public NoteController(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    @RequestMapping("/notes")
    public String getAll(Model model) {
        List<Note> notes = notesRepository.findAll();
        notes.sort(Comparator.comparing(Note::getId));
        model.addAttribute("notes", notes);
        model.addAttribute("note", new Note("Empty note"));
        return "notes";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") long id) {
        notesRepository.deleteById(id);
        return "redirect:/notes";
    }

    @PostMapping(path = "/notes")
    public String save(@ModelAttribute Note note) {
        notesRepository.save(note);
        return "redirect:/notes";
    }

    @RequestMapping(value = "/done/{id}")
    public String setDone(@PathVariable("id") long id) {
        Note note = notesRepository.getOne(id);
        note.setDone(true);
        notesRepository.save(note);
        return "redirect:/notes";
    }

    @RequestMapping(value = "/edit/{id}")
    public String edit(Model model, @PathVariable("id") long id) {
        Note note = notesRepository.getOne(id);
        model.addAttribute("note", note);
        return "editNote";
    }

    @PostMapping(path = "/update")
    public String update(@ModelAttribute Note note) {
        notesRepository.save(note);
        return "redirect:/notes";
    }
}
