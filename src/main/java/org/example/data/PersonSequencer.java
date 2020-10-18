package org.example.data;

/*Create a new class PersonSequencerin data package.a.In PersonSequencer create a private static int variable called personId.
b.Add a static method called nextPersonIdthat increment and return the next personId value.
c.Add a static method called reset()that sets the personId variable to 0.
d.Unit test PersonSequencer with Junit.
e.Commitchanges
 */
public class PersonSequencer {
    private static int personId;
    public static int getNextPersonId(){
        personId ++;
        return personId;
    }
    public static void reset(){
        personId =  0;
    }
}