//Create a new package called model
package org.example.model;

/*Create Personclass in packagemodel
 a.Required fields are personId(int and final), firstNameand lastName(String)
 b.Make a constructor that can build the object.
 c.Create needed getters and setters.
 d.Unit test with Junit.
 e.Commitchanges*/

import java.io.Serializable;

public class Person implements Serializable {
    //fields
    private final int personId;
    private String firstName;
    private String lastName;
    // The constructor method
    public Person(int personId, String firstName, String lastName) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public static void findById(int i) {
    }
    //  Getters and Setters
    public int getPersonId() {
        return personId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String toString()
    {
        return personId + " " + firstName;
    }
}