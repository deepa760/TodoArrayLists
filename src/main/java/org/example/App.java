package org.example;


import org.example.data.People;
import org.example.data.TodoItems;
import org.example.model.Person;
import org.example.model.Todo;

import java.util.Scanner;

/*Nour comments:
1- add date to the Todo
2- covert array to arraylist to skip change size thing
3- think about how you want to connect preson with Todo
*/

public class App
{
    private People people = new People();
    private TodoItems taskList = new TodoItems();
    private Scanner scanner = new Scanner(System.in);

    public People getPeopleList(){return people;}
    public TodoItems getTaskList(){return taskList;}

    public void run( )
    {
        people.addPerson("hema", "gg");
        people.addPerson("deepa", "rr");

        while(true) {
            //solution like trello:
            System.out.println(" Welcome, there x task done, y task...");
            System.out.println("press 1) show , 2) add 3)edit 4)Remove");
            int x = Integer.parseInt(scanner.nextLine());

            switch (x) {
                case 1:
                    //show
                    //System.out.println("1 sort by date, 2 filter by project, 3 filter by user" +
                        //    ", 4 show unassigned, ... ");
                    showMenu();
                    break;

                case 2:
                    System.out.println("type the title");
                    String desc = scanner.nextLine();
                    System.out.println("type the date");
                    String date = scanner.nextLine();
                    System.out.println("Do you want to assign a specific user to it, type his id");
                    String userId = scanner.nextLine();

                    Todo task = taskList.addTask(desc, date);
                    if (userId.equals(""))
                        System.out.println("No user will be added ");

                    else {
                        Person user = people.findById(Integer.parseInt(userId));
                        taskList.assign(task, user);
                    }

                    break;
                //To check if task is done or not!!
                case 3:

                    System.out.println("Check if the task is done or not!!");
                    break;
                //To delete the task!!
                case  4:
                    break;

                case 5:
                    //sort by date


                    break;


            }
        }



    }

    private void showMenu()
    {
        System.out.println(people.findAll());
        System.out.println(taskList.findAll());
    }


    public static void main(String[] args) {
        App app = new App();
        app.run();
    }










}