package org.example.old_code;


import org.example.data.People;
import org.example.data.TodoItems;

import java.util.Scanner;

/*Nour comments:
1- add date to the Todo
2- covert array to arraylist to skip change size thing
3- think about how you want to connect preson with Todo
*/

public class App
{
    private People peopleList = new People();
    private TodoItems taskLsit = new TodoItems();

    public People getPeopleList(){return peopleList;}
    public TodoItems getTaskList(){return taskLsit;}

    public static void main( String[] args )
    {
        App app = new App();
        People people = app.getPeopleList();
        people.addPerson("hema", "gg");
        people.addPerson("nour", "rr");

        //person.setFirstName("hema");
        //person.getPersonId();
        //System.out.println("personId");
        //Person.findById(1);


        //Nour:

        //Sign in process:
        Scanner scanner = new Scanner(System.in);
        //check the users file if the file is empty do:
        System.out.println("there is no regerstered ueser in this todo");
        System.out.println("write your name");
        String firstname = scanner.nextLine();
        String second = scanner.nextLine();

        People p = new People();
        p.addPerson(firstname, second);


        //another solution trello:
        System.out.println(" Welcome, there x task done, y task...");
        System.out.println("press 1) show , 2) add 3)edit 4)save 5) add user");
        TodoItems itemList = new TodoItems();
        int x = Integer.parseInt(scanner.nextLine());

        switch (x)
        {
            case 1:
                //show
                System.out.println("1 sort by date, 2 filter by project, 3 filter by user" +
                        ", 4 show unassigned, ... ");



            case 2:
                System.out.println("type the title");
                String desc = scanner.nextLine();
                System.out.println("type the date");
                String date = scanner.nextLine();
                //int id = itemList.newTodo(desc);
                System.out.println("Do you want to assign a specific user to it");
                String user = scanner.nextLine();

                itemList.addTask(desc, date);
                if (user.equals(""))
                {
                    System.out.println("No user will be added ");
                    /*do nothing itemList.newTodo(desc); */
                }
                else
                {
                    itemList.addTask(desc, date);
                    //itemList.newTodo(desc, user);
                    //itemList.assign(id, user);
                }
        }






    }
















}