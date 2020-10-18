package org.example;


import org.example.data.People;
import org.example.data.TodoItems;
import org.example.model.Person;
import org.example.model.Todo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;



public class App
{
    private People people = new People();
    private TodoItems taskList = new TodoItems();
    private Scanner scanner = new Scanner(System.in);
    public People getPeopleList(){return people;}
    public TodoItems getTaskList(){return taskList;}

    public void run( )
    {
        people.addPerson("hema", "Gana");
        people.addPerson("deepa", "Newname");
        people.addPerson("Anagha", "Newname1");
        people.addPerson("kitty", "Newname3");
        while(true) {

                     System.out.println("*************************************************");
                     System.out.println(" Welcome, there  x task done, y task...");
                     System.out.println("*************************************************");
                     System.out.println("Press 1) Display the list");
                     System.out.println(  "2) Add the tasks ");
                     System.out.println("3) Update the tasks");
                     System.out.println("4) Remove the task ");
                     System.out.println("5) Sort by date  " );
                     System.out.println ("6) Display the task DONE ");
                     System.out.println("7)  Quit.........");
            int x = Integer.parseInt(scanner.nextLine());
            switch (x) {
                case 1:
                    //show or display the list in the Menu.
                    System.out.println("**********************The displayed list is ****************");
                    showMenu();
                    break;
                case 2:
                    System.out.println("type the title");
                    String desc = scanner.nextLine();
                    System.out.println("type the date in a format yyyy-MM-dd");
                    String date = scanner.nextLine();
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate ld = LocalDate.parse(date, format);
                    System.out.println("Do you want to assign a specific user to it, type his id");
                    String userId = scanner.nextLine();
                    Todo task = taskList.addTask(desc, ld);
                    if (userId.equals(""))
                        System.out.println("No user will be added.................... ");

                    else {
                        Person user = people.findById(Integer.parseInt(userId));
                        taskList.assign(task, user);
                    }
                    break;
                /********************To check if the task is done ensure its completed.**********************/
                case  3:
                    System.out.println("Check and MOdify the task!!!!!!!!!!!!!!!!!!!!!!!");
                    updateList();
                    showMenu();
                    break;

                case  4:
                    System.out.println("Remove the task,Specify its id.....................");
                    String userId1 = scanner.nextLine();
                    taskList.removeItem( Integer.parseInt(userId1));
                    //taskList.removeItem();
                    break;
                case 5:
                    System.out.println("Sort the task by Date....................");
                    taskList.sortByDate();
                    showMenu();
                    break;
                case 6:System.out.println("Display Tasks which are  done....................");
                    ArrayList<Todo> doneTasks = taskList.findByDoneStatus(true);
                    System.out.println(doneTasks);
                    showMenu();
                       break;
                case 7: System.out.println("We are coming out of the App!!!!!!!!!!!!Recheck once............");
                        quitTask();
                        break;
            }
        }
    }

    private void updateList()
    {
        /*
         * 1. ask the user which task/todo he want to update
         *  2. what to update exactly (user, date, status)
         * */
        System.out.println("Enter the id which you want to update");
        // TODO have a method that take care of exception
        String userId2 = scanner.nextLine();
        System.out.println("what to update, 1-name, 2-date, 3-status,...");
        String whatToUpdate = scanner.nextLine();
        int c = Integer.parseInt(whatToUpdate);
        switch (c)
        {
            case 1:
                System.out.println("Please type the new desc");
                String newDesc = scanner.nextLine();
                taskList.updateDescription(newDesc, Integer.parseInt(userId2));
                break;
                //cas2
        }

        //taskList.updateTask(Integer.parseInt(userId2));

    }

    private void showMenu()
    {
        System.out.println(people.findAll());
        System.out.println(taskList.findAll());
    }

    public void quitTask()
    {
     System.out.println("Quitting..........Hej!!!!!!!!!!!!!!!!!");
     System.exit(0);
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }










}