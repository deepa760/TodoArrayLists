package org.example.data;

import org.example.model.Person;
import org.example.model.Todo;
import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TodoItems {
    //private static ArrayList<Todo> todos;
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

    /************************************Adding the tasks**************************************/
    public Todo addTask(String des, LocalDate date){

        Todo todo= new Todo(TodoSequencer.getNextTodoId(), des, date);
        todos.add(todo);
        return todo;
    }
   /* public static void clear(){
        todos = new ArrayList<>();
    }*/

    /*****************************To check by Done status********************/
    public ArrayList<Todo> findByDoneStatus(boolean doneStatus)
    {
        ArrayList<Todo> statusArray = new ArrayList<>();
        if(statusArray.isEmpty())
        {
            System.out.println("Check if the task is done or not!!!");
        }
        else
        {

            //Todo statustask=todos.(doneStatus);
            //System.out.println("The tasks are removed");
            //}
        }
        for (int i = 0; i < size(); i++){
            if (todos.get(i).getDone() == doneStatus) {
                statusArray.add(todos.get(i) );
            }
        }
        return statusArray;
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

    /*****************************To check unassigned To-do Items********************************/
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
    /******************************Sorting by date*********************************/
    public ArrayList<Todo> sortByDate()
    {
        //you can use streams to sort also
        Collections.sort(todos, new Comparator<Todo>() {
            @Override
            public int compare(Todo o1, Todo o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        return todos;
    }

    /*******************To remove the task id******************************/
/*a.Functionality to remove object from array.(not nulling)
First:you need to find the correct array index of the object.
Second: You need to rebuild array by excludingthe object on found index*/
    public void  removeItem(int todoId)
    {
         if(todos.isEmpty())
         {
         System.out.println("LIst is empty,Please add task");
         }
         else
             {

                  Todo removetask=todos.remove(todoId-1);
                  System.out.println("The task  removed::"+removetask);
                  //}
    }

    }
    /*********************************To assign the task to a person****************************/
    public void assign(Todo task, Person user)
    {
        for (Todo t : todos)
        {
            if (task.equals(t)) //TODO implements equals method inside the todo class{
                t.setAssignee(user);
        }
    }

    public void updateDescription(String newDesc, int id)
    {
        Todo task = todos.get(id);
        task.setDescription(newDesc);
    }




}
