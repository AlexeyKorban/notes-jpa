package ru.ldwx.notesjpa.data;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import ru.ldwx.notesjpa.Note;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

import static ru.ldwx.notesjpa.NoteTestData.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(scripts = "/populateDB.sql")
public class NotesRepositoryTest {

    @Autowired
    private NotesRepository repository;

    @Test
    public void getAll() {
        assertThat(repository.findAll()).isEqualTo(NOTES);
    }

    @Test
    public void delete() {
        repository.deleteById(NOTE1_ID);
        assertThat(repository.findAll()).isEqualTo(Arrays.asList(NOTE2, NOTE3, NOTE4, NOTE5, NOTE6));
    }

    @Test
    public void create() {
        Note created = getCreated();
        Note saved = repository.save(created);
        assertThat(repository.findAll()).isEqualTo(Arrays.asList(NOTE1, NOTE2, NOTE3, NOTE4, NOTE5, NOTE6, saved));
    }

    @Test
    public void get() {
        Note actual = repository.findById(NOTE1_ID).orElse(null);
        Assert.assertEquals(actual, NOTE1);
    }

    @Test
    public void update() {
        Note updated = getUpdated();
        repository.save(updated);
        assertThat(repository.findById(NOTE1_ID).orElse(null)).isEqualTo(updated);
    }

    /*
    @Test
    void getBetween() throws Exception {

    }
     */

}