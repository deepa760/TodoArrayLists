package org.example.data;

import org.example.model.Person;
import org.example.model.Todo;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

    public class TodoTest {

        private Todo test = new Todo(0, "happy", LocalDate.of(2020, 1, 8));
        private Person testperson = new Person(0, "hema", "h");
//New line
       /* @Before
        public void add_values() throws Exception{
            testperson = new Person(1,"FirstTest","LastTest");
            test = new Todo(1,"Test","2020/06/10");

            test.setDone(true);
            test.setAssignee(testperson);
        }*/


        @Test
        public void return_person(){
            test.setAssignee(testperson);
            assertEquals(testperson, test.getAssignee());

        }

    }
