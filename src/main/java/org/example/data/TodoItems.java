package org.example.data;


import org.example.model.Person;
import org.example.model.Todo;

import java.util.ArrayList;
import java.util.Collection;


public class TodoItems {
    private ArrayList<Todo> todos = new ArrayList<>();

    public int size() {
        return todos.size();
    }

    public ArrayList<Todo> findAll() {
        return todos;
    }
    public Todo findById(int todoId){
        for (int i = 0; i < size(); i++){
            if (todos.get(i).getTodoId() == todoId)
                return todos.get(i);
        }
        return null;
    }

    public Todo addTask(String des, String date){
        Todo todo= new Todo(TodoSequencer.getNextTodoId(), des, date);
        todos.add(todo);
        return todo;
    }


    public void clear(){
        todos = new ArrayList<>();
    }

    public ArrayList<Todo> findByDoneStatus(boolean doneStatus)
    {
        ArrayList<Todo> statusArray = new ArrayList<>();
        for (int i = 0; i < size(); i++){
            if (todos.get(i).getDone() == true) {
                statusArray.add(todos.get(i) );
            }
        }
        return statusArray;
    }

    //TODO you may delete this
    public ArrayList<Todo> findByAssignee(int user)
    {
        ArrayList<Todo> t = new ArrayList<>();

        for (int i = 0; i < size(); i++){
            if (todos.get(i).getAssignee().equals(user))
            {
                t.add(todos.get(i) );
            }
        }
        return t;
    }

    //TODO overridde the equals method inside the person class
    public ArrayList<Todo> findByAssignee(Person user)
    {
        ArrayList<Todo> t = new ArrayList<>();

        for (int i = 0; i < size(); i++){
            if (todos.get(i).getAssignee().equals(user))
            {
                t.add(todos.get(i) );
            }
        }
        return t;
    }

    public ArrayList<Todo> findUnassignedTodoItems()
    {
        ArrayList<Todo> t = new ArrayList<>();
        for (int i = 0; i < size(); i++)
        {
            if(todos.get(i).getAssignee() == null){
                t.add(todos.get(i));
            }
        }
        return t;
    }

    //TODO Change this to use iterator
    public void removeItem(int todoId)
    {
        for (int i = 0; i < size(); i++){
            if (todoId != todos.get(i).getTodoId()){
                todos.remove(i);
            }
        }
    }

    public void assign(Todo task, Person user)
    {
        for (Todo t : todos)
        {
            if (task.equals(t)) //TODO implement equals method inside the todo class
            {
                t.setAssignee(user);
            }
        }
    }
}