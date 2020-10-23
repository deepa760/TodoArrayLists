package org.example.data;

import org.example.model.Todo;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    public Object readFile(String fileName){
        //ArrayList<Todo> list = new ArrayList<>();
        Object object = null;
        try {
            FileInputStream fis = new FileInputStream(new File(fileName));
            ObjectInputStream ois = new ObjectInputStream(fis);

            object = ois.readObject();
            ois.close();
        } catch (EOFException e) {
            System.out.println("The file is empty");
        } catch (IOException e) {
            System.out.println("the file is not fount");
        } catch (ClassNotFoundException e) {
            System.out.println("the file contains wireed things");
        }
        return object;
    }


    public void writeFile(Object list, String fileName)
    {
        try
        {
            FileOutputStream fis = new FileOutputStream(new File(fileName));
            ObjectOutputStream ois = new ObjectOutputStream(fis);

            ois.writeObject(list);

            ois.close();
        } catch (EOFException e) {
            System.out.println("The file is empty");
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("the file is not fount");
        }
    }
}
