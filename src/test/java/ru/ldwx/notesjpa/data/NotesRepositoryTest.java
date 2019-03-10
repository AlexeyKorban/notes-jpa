package ru.ldwx.notesjpa.data;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(scripts = "/populateDB.sql")
public class NotesRepositoryTest {

    @Autowired
    private NotesRepository repository;

    @Test
    public void getTest() {
        Assert.assertEquals(2, repository.count());
    }

}