package lab1;
import java.util.*;

public class Q12eThrows {

    static void show(int x) throws Exception {
        if (x < 0)
            throw new Exception("Negative value");
        System.out.println("Value: " + x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            show(sc.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("\nLab1, Sulav Adhikari, 2381003");
    }
}
