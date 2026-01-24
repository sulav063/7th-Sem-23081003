package lab1;

import java.util.Scanner;

class OuterStatic {
    static class StaticNested {
        void display(String msg) {
            System.out.println("Static Nested says: " + msg);
        }
    }
}

public class Q9aStaticNestedClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message for Stat hlo"
                + "ic Nested Class: ");
        String msg = sc.nextLine();

        OuterStatic.StaticNested sn = new OuterStatic.StaticNested();
        sn.display(msg);

        // Footer
        System.out.println("\nLab1, Sulav Adhikari,23081003");

        sc.close();
    }
}
