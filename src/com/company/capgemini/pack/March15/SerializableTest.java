package com.company.capgemini.pack.March15;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args)
    {
        SerializableExample object = new SerializableExample(550, "Mahesh");
        String filename = "C:\\CapSpace\\src\\com\\company\\capgemini\\pack\\March15\\file.ser";
        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            // Method for serialization of object
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        // Deserialization
        SerializableExample object1 = null;
        try
        {
            // Reading the object from a file
            FileInputStream file1 = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file1);
            // Method for deserialization of object
            object1 = (SerializableExample)in.readObject();
            in.close();
            file1.close();
            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
