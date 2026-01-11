package lab1;

import java.io.*;

public class Q14hKeywordtoFile {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\Acer\\Downloads\\a.txt";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter f = new FileWriter(filepath)) {

            System.out.print("Enter text to write to file: ");
            String line = br.readLine();
            f.write(line);
            System.out.println("Text written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.print("\nLab1, Sulav Adhikari, 2381003");
    }
}
