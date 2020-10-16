package org.example;


import org.example.data.People;
import org.example.data.TodoItems;
import org.example.model.Person;
import org.example.model.Todo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
            //solution like trello:
            System.out.println(" Welcome, there x task done, y task...");
            System.out.println("Press 1) Display the list ,2) Add the tasks 3)Modify the Task 4)Remove the task 5)Sort by date 6)Quit 7)Display the task DONE") ;

            int x = Integer.parseInt(scanner.nextLine());

            switch (x) {
                case 1:
                    //show

                    taskList.sortByDate();
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
                        System.out.println("No user will be added ");

                    else {
                        Person user = people.findById(Integer.parseInt(userId));
                        taskList.assign(task, user);
                    }
                    break;
                //To check if the task is done ensure its completed.
                case  3:
                    System.out.println("Check and MOdify the task!!");
                    break;

                case  4:
                    System.out.println("Remove the task,Specify its name");
                    String userId1 = scanner.nextLine();
                    Todo taskremove = taskList.removeItem();
                    taskList.removeItem();
                    showMenu();
                    break;
                case 5:
                    System.out.println("Sort the task by Date");
                    taskList.sortByDate();
                    showMenu();
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