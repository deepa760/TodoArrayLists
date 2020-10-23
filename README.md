ToDo - a simple to do list Application!
Table of Contents
About the Project
Built With
UML Diagrams
Logo
User Manual
License
Contact
Acknowledgements
About the Project
ToDoLy is a simple text based to-do list application. The user is able to add, edit, display, remove and save tasks all from the comfort of their terminal. When adding a task one is able to set the task title, the project it belongs to, its due date and status (open or done) and these fields maybe be adjusted after the intial creation of the task, editing ;) . When one wants to see the entirety of their to-do list all they need do is display their tasks using the aforefentioned display function! The tasks may be stylishly displayed according to their project handles or due dates for your viewing pleasure. The application implements a task number system so to edit and remove one needs to know the number of the task they want to mamnipulate. How, one might ask, is the user supposed to know this number? Have no fear, as when ever one edits or removes, the tasks are displayed for the users perusal of the relevant task numbers. When the user is done using the application, all they need to do to make sure all they’re important tasks are still there the next time, is save and quit, now conventiently located within one single action!

Built with
IntelliJ IDEA 2020.2.2
Java 11.0.8
.txt file for storing and retrieving data.
tears
Class Diagram
Application Logo

User Manual
You’re likely a manual user, so you might this user manual

Licence:
Open source
Resources and Acknowledgements
I would like to thank StackOverflow, Youtube, the World of Zuul project from Objects first with Java and Fred.

Resources and Acknowledgements
I would like to thank StackOverflow, Youtube, the World of Zuul project from Objects first with Java and Fred.# Todo project illustrates about the tasks assigned to a person which consists of the below lists.
The application will allow a user to
create new tasks, assign them a title and  date, and choose a project for that
task to belong to. They will need to use a text based user interface via the
command-line.
Once
they are using the application, the user should be able to also edit, mark as done or
remove tasks. They can also quit and save the current task list to file, and then
restart the application with the former state restored.

Requirements
The solution must achieve the following requirements:
‣ Model a task with a task title, due date and project
‣ Display a collection of tasks that can be sorted both by date
‣ Support the ability to add, edit, mark as done, and remove tasks
‣ Support a text-based user interface
‣ Load and save task list to file.

Basic steps for creating a Todo Project.
Instructions
1.Create a maven project
a.Choose the “maven-archetype-quickstart”as the archetype.
b.Groupid should be org.example.[groupname].
c.Artefact id should be todo_it.
d.When generated,navigate to“~/pom.xml”and make sure thattheprojectuses java 8+andJunit4.12+.
e.Run your program and make sure it compiles.
f.Push the empty project to GitHub

After execution of the project,please find the screenshots of the implementation.
FAQ
Q1: How do I download the files?
A: If you're new to GitHub and just want to download the complete package, hit the green button saying "Clone or download", choose the "Download ZIP" option, and you're good to go.
