package lab1;
import java.io.*;

public class Q14aFileInputStream {
    public static void main(String[] args) {
        try (FileInputStream f = new FileInputStream("C:\\Users\\Acer\\Downloads\\Lab1.txt")) {
            int i;
            while ((i = f.read()) != -1)
                System.out.print((char)i);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the path.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        System.out.print("\nLab1, Sulav Adhikari, 2381003");
    }
}
