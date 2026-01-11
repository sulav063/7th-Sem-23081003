package lab1;
import java.io.*;

public class Q14cImage {
    public static void main(String[] args) {
        String source = "C:\\Users\\Acer\\Downloads\\img1.png";
        String dest   = "C:\\Users\\Acer\\Downloads\\img2.png";

        try (FileInputStream f1 = new FileInputStream(source);
             FileOutputStream f2 = new FileOutputStream(dest)) {

            int i;
            while ((i = f1.read()) != -1)
                f2.write(i);

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + source);
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }

        System.out.print("\nLab1, Sulav Adhikari, 2381003");
    }
}
