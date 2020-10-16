package org.example.model;
import java.time.*;

/*Create Todoclassin the model packagea.Required fields are todoId(int and final), description(String), done(boolean)and assignee(Person).
b.Make a constructor that take in todoId(int) and a description(String).
c.Create needed getters and setters.
d.Unit Test with Junit*/

public class Todo {
    public Todo(int todoId, String description, LocalDate date) {
        this.todoId = todoId;
        this.description = description;
        this.date = date;
        this.done = false;
    }
    //fields
    private final int todoId;
    private String description;
    private  LocalDate date;
    private Boolean done;
    Person assignee;
    //Getters & Setters
    public int getTodoId() {
        return todoId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public Boolean getDone() {
        return done;
    }
    public void setDone(Boolean done){
        this.done = done;
    }
    public Person getAssignee() {
        return assignee;
    }
    public void setAssignee (Person assignee) {
        this.assignee = assignee;
    }
    public LocalDate getDate() { return date; }
    public String toString()
    {
        return todoId + " " + description + " " + assignee +" "+date;
    }

    public boolean isDone() {
    }
}
