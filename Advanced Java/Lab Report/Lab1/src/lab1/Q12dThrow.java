package lab1;
import java.util.*;

public class Q12dThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18)
                throw new Exception("Not eligible");
            System.out.println("Eligible");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("\nLab1, Sulav Adhikari, 2381003");
    }
}
