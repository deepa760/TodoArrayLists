package org.example.data;

import org.junit.Before;
import org.junit.Test;
import org.example.data.TodoItems;
import org.example.model.Person;
import org.example.model.Todo;

import static org.junit.Assert.*;

public class TestTodoItems {

    private TodoItems testTodo;

    @Before
    public void doBefore() {
        testTodo = new TodoItems();
        //TodoItems.clear();
       // testTodo.addTask(("Fancy Description");
       // testTodo.addTask(("Playing Keyboard");
    }
    @Test
    public void findByIdFalse() {
        //Act
        Todo foundId = testTodo.findById(3);

        //Assert
        assertNull(foundId);
    }
    @Test
    public void findByAssigneeIdNothingFound() {
        //Arrange
        Todo[] assigneeId;

        //Act
      //  assigneeId = testTodo.findByAssignee(1);


        //Assert
      //  assertEquals(0, assigneeId.length);

    }

    @Test
    public void findByAssigneePersonNothingFound() {
        //Arrange
        Todo[] arrayPersonInObject;
        Person testPerson = new Person(5, "John", "Smith");
        //Act
        arrayPersonInObject = testTodo.findByAssignee(testPerson).toArray(new Todo[0]);
        //Assert
        assertEquals(0, arrayPersonInObject.length);
    }


}
