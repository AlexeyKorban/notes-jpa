package ru.ldwx.notesjpa;

public class Note {
    private Long id;
    private String data;
    private Boolean isDone;

    public Note(String data) {
        this.data = data;
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
}
