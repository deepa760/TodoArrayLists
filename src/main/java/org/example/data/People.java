package org.example.data;

import org.example.model.Person;

import java.util.ArrayList;

public class People {

    private ArrayList<Person> peopleList = new ArrayList<>();

    public int size() {
        return peopleList.size();
    }

    public ArrayList<Person> findAll() {
        return peopleList;
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



}
