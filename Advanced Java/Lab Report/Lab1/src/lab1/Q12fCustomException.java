package lab1;
import java.util.*;

class MyException extends Exception {
    MyException(String m) {
        super(m);
    }
}

public class Q12fCustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int x = sc.nextInt();

            if (x < 0)
                throw new MyException("Invalid number");

            System.out.println("Value: " + x);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("\nLab1, Sulav Adhikari, 2381003");
    }
}
