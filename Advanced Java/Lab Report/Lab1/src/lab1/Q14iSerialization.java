package lab1;

import java.io.*;

public class Q14iSerialization {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\Acer\\Downloads\\a.txt";

        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(filepath))) {
            A obj = new A();
            o.writeObject(obj);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.print("\nLab1, Sulav Adhikari, 2381003");
    }

    // Make A static and public inside the main class
    public static class A implements Serializable {
        int x = 10;
    }
}
