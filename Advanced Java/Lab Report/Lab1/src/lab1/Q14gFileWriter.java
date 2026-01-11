package lab1;
import java.io.*;
import java.util.*;

public class Q14gFileWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filepath = "C:\\Users\\Acer\\Downloads\\data.txt";

        try (FileWriter f = new FileWriter(filepath)) {
            System.out.print("Enter text to write to file: ");
            String text = sc.nextLine();
            f.write(text);
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.print("\nLab1, Sulav Adhikari, 2381003");
    }
}
