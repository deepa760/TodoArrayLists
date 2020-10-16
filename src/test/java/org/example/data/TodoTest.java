package org.example.data;

import org.example.model.Person;
import org.example.model.Todo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class TodoTest {

        private Todo test;
        private Person testperson;

        @Before
        public void add_values() throws Exception{
            testperson = new Person(1,"FirstTest","LastTest");
            test = new Todo(1,"Test",
                    "2020/06/10');
            test.setDone(true);
            test.setAssignee(testperson);
        }

        @Test
        public void return_right_fields() {

            assertEquals(1, test.getTodoId());
            assertEquals("Test", test.getDescription());

        }
        @Test
        public void return_if_done(){

            assertEquals(true, test.isDone());

        }
        @Test
        public void return_person(){

            assertEquals(testperson, test.getAssignee());

        }

    }


}
