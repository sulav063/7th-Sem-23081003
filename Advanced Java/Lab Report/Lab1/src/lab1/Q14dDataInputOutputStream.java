package lab1;
import java.io.*;
import java.util.*;

public class Q14dDataInputOutputStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filepath = "C:\\Users\\Acer\\Downloads\\data.txt";

        try {
            System.out.print("Enter an integer to write to file: ");
            int num = sc.nextInt();

            // Write integer to file
            try (DataOutputStream d = new DataOutputStream(new FileOutputStream(filepath))) {
                d.writeInt(num);
            }

            // Read integer from file
            try (DataInputStream in = new DataInputStream(new FileInputStream(filepath))) {
                int readNum = in.readInt();
                System.out.println("Integer read from file: " + readNum);
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        System.out.print("\nLab1, Sulav Adhikari, 2381003");
    }
}


