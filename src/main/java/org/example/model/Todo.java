package org.example.model;

public class Todo {
    //fields
    private final int todoId;
    private String description;
    private String date; //TODO change this to localdate
    private Boolean done;
    Person assignee;

    // The constructor method
    public Todo (int todoId, String description, String date) {
        this.todoId = todoId;
        this.description = description;  //TODO add assign date
        assignee = null;
    }

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

    public String toString()
    {
        return todoId + " " + description + " " + assignee;
    }
}
