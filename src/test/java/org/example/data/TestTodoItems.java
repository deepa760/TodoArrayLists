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
    public void createTwoObjects() {
        //Assert
        assertEquals(1, testTodo.findAll().get(0).getTodoId());
        assertEquals("Fancy Description", testTodo.findAll().get(0).getDescription());
        assertEquals(2, testTodo.findAll().get(1).getTodoId());
        assertEquals("Another Fancy Description", testTodo.findAll().get(1).getDescription());
    }

    @Test
    public void findByIdTrue() {
        //Act
        Todo foundId = testTodo.findById(2);

        //Assert
        assertSame(foundId, testTodo.findById(2));
    }

    @Test
    public void findByIdFalse() {
        //Act
        Todo foundId = testTodo.findById(3);

        //Assert
        assertNull(foundId);
    }

    @Test
    public void findByDoneStatusBothFalse() { //Default bool for both objects are false
        //Arrange
        Todo[] statusTodo;

        //Act
        statusTodo = testTodo.findByDoneStatus(false).toArray(new Todo[0]);

        //Assert
        assertEquals(2, statusTodo.length);
        assertEquals(1, statusTodo[0].getTodoId());
        assertEquals("Fancy Description", statusTodo[0].getDescription());
        assertEquals(2, statusTodo[1].getTodoId());
        assertEquals("Another Fancy Description", statusTodo[1].getDescription());
    }

    @Test
    public void findByDoneStatusOneTrue() { // First object is false by default
        //Arrange
        Todo[] statusTodo;
        testTodo.findAll().get(1).setDone(true);

        //Act
        statusTodo = testTodo.findByDoneStatus(true).toArray(new Todo[0]);

        //Assert
        assertEquals(1, statusTodo.length);
        assertEquals(2, statusTodo[0].getTodoId());
        assertEquals("Another Fancy Description", statusTodo[0].getDescription());
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
    public void findByAssigneeIdFoundTwoAssignees() {
        //Arrange
        Todo[] assigneeId;
        Person testPerson = new Person(5, "John", "Smith");
        testTodo.findAll().get(0).setAssignee(testPerson);
        testTodo.findAll().get(1).setAssignee(testPerson);

        //Act
      //  assigneeId = testTodo.findByAssignee(5);

        //Assert
     //   assertEquals(2, assigneeId.length);
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

    @Test
    public void findByAssigneePersonTwoFound() {
        //Arrange
        Todo[] arrayPersonInObject;
        Person testPerson = new Person(5, "John", "Smith");
        testTodo.findAll().get(0).setAssignee(testPerson);
        testTodo.findAll().get(1).setAssignee(testPerson);

        //Act
        arrayPersonInObject = testTodo.findByAssignee(testPerson).toArray(new Todo[0]);

        //Assert
        assertEquals(2, arrayPersonInObject.length);
    }

    @Test
    public void findUnassignedTodoItemsNothingFound() {
        //Arrange
        Todo[] arrayUnAssignedPerson;

        //Act
        arrayUnAssignedPerson = testTodo.findUnassignedTodoItems().toArray(new Todo[0]);

        //Assert
        assertEquals(2, arrayUnAssignedPerson.length);
    }

    @Test
    public void findUnassignedTodoItemsFoundAssignees() {
        //Arrange
        Todo[] arrayUnAssignedPerson;
        Person testPerson = new Person(5, "John", "Smith");
        testTodo.findAll().get(0).setAssignee(testPerson);
        testTodo.findAll().get(1).setAssignee(testPerson);

        //Act
        arrayUnAssignedPerson = testTodo.findUnassignedTodoItems().toArray(new Todo[0]);

        //Assert
        assertEquals(0, arrayUnAssignedPerson.length);
    }

    @Test
    public void deletePersonIdNotFound() {
        //Arrange

        //Act
        testTodo.removeItem(5); // testPeople has only two objects as default

        //Assert
        assertEquals(2, testTodo.size());

    }

    @Test
    public void deletePersonIdFound() {
        //Arrange
     //   testTodo.addTask("Superior Fancy Description",1);

        //Act
        testTodo.removeItem(2);

        //Assert
        assertEquals(2, testTodo.size());
        assertEquals(1, testTodo.findAll().get(0).getTodoId());
        assertEquals("Fancy Description", testTodo.findAll().get(0).getDescription());
        assertEquals(3, testTodo.findAll().get(1).getTodoId());
        assertEquals("Superior Fancy Description", testTodo.findAll().get(1).getDescription());
    }

}
