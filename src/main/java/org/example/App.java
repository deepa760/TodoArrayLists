package org.example;


import org.example.data.People;
import org.example.data.TodoItems;
import org.example.model.Person;

import java.util.Scanner;

/*Nour comments:
1- add date to the Todo
2- covert array to arraylist to skip change size thing
3- think about how you want to connect preson with Todo
*/

public class App {
    public static void main( String[] args )
    {
        Person person = new Person(1235, "hema", "g");
        person.setFirstName("hema");
        person.getPersonId();
        System.out.println("personId");
        Person.findById(1);

        //Nour:

        //Sign in process:
        Scanner scanner = new Scanner(System.in);
        //check the users file if the file is empty do:
        System.out.println("there is no regerstered ueser in this todo");
        System.out.println("write your name");
        String firstname = scanner.nextLine();
        String second = scanner.nextLine();

        People p = new People();
        p.newPerson(firstname, second);


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
                //int id = itemList.newTodo(desc);
                System.out.println("Do you want to assign a specific user to it");
                String user = scanner.nextLine();
                if (user.equals(""))
                {
                    System.out.println("No user will be added ");
                    /*do nothing itemList.newTodo(desc); */
                }
                else
                {
                    //itemList.newTodo(desc, user);
                    //itemList.assign(id, user);
                }
        }






    }
















}