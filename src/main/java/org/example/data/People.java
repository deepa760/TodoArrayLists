package org.example.data;
//Create new package called data.
import org.example.model.Person;
import java.util.ArrayList;


public class People {
    //Have a private static Person arraydeclared and instantiated as empty and not null(new Person[0])
    private ArrayList<Person> peopleList;
    //Add a method publicint size()that return the length of the array.
    public int size() {
        return peopleList.size();
    }
    //Add a method public Person[] findAll()that return the person array
    public ArrayList<Person> findAll() {
        return peopleList;
    }
    //Add a method public Person findById(int personId)that return the person that has a mathing personId as the passed in parameter

    public FileHandler fh = new FileHandler();

    public People()
    {
        Object o = fh.readFile("people");
        if (o == null)
            peopleList = new ArrayList<>();
        else
            peopleList = (ArrayList<Person>) o;

    }

    public  Person findById(int personId)
    {
        for (int i = 0; i < size(); i++){
            if (peopleList.get(i).getPersonId() == personId)
                return peopleList.get(i);
        }
        return null;
    }
    public Person addPerson(String fname, String lname){
        Person person = new Person(PersonSequencer.getNextPersonId(), fname, lname);
        peopleList.add(person);
        return person;
    }
    public  void clear(){
        peopleList = new ArrayList<>();
        PersonSequencer.reset();
    }

    public void savePeople()
    {
        fh.writeFile(peopleList, "people");
    }


}
