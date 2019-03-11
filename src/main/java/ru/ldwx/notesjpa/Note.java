package ru.ldwx.notesjpa;

import javax.persistence.*;
import java.util.Objects;

@Entity
@SequenceGenerator(name = "seq", initialValue = 100002)
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Long id;
    private String data;
    private Boolean isDone = false;

    public Note() {
    }

    public Note(String data) {
        this.data = data;
    }

    public Note(Long id, String data, Boolean isDone) {
        this.id = id;
        this.data = data;
        this.isDone = isDone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(id, note.id) &&
                Objects.equals(data, note.data) &&
                Objects.equals(isDone, note.isDone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, isDone);
    }
}
