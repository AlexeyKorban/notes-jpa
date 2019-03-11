package ru.ldwx.notesjpa;

import java.util.Arrays;
import java.util.List;

public class NoteTestData {
    public static final long START_SEQ = 100000;
    public static final long NOTE1_ID = START_SEQ;

    public static final Note NOTE1 = new Note(NOTE1_ID, "Первая заметка", false);
    public static final Note NOTE2 = new Note(NOTE1_ID + 1, "Вторая заметка", false);
    public static final Note NOTE3 = new Note(NOTE1_ID + 2, "Третья заметка", false);
    public static final Note NOTE4 = new Note(NOTE1_ID + 3, "Четвертая заметка", false);
    public static final Note NOTE5 = new Note(NOTE1_ID + 4, "Пятая заметка", false);
    public static final Note NOTE6 = new Note(NOTE1_ID + 5, "Шестая заметка", false);

    public static final List<Note> NOTES = Arrays.asList(NOTE1, NOTE2, NOTE3, NOTE4, NOTE5, NOTE6);

    public static Note getCreated() {
        return new Note("Созданная заметка");
    }

    public static Note getUpdated() {
        return new Note(NOTE1_ID, "Обновленная заметка", true);
    }

}
