package lab1;

import java.util.Scanner;

class Outer {
    class Inner {
        void show(int number) {
            System.out.println("Inner Class received number: " + number);
        }
    }
}

public class Q9bNonstaticNested {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean valid = false;

        // Loop until user enters a valid integer
        while (!valid) {
            System.out.print("Enter a number for Inner Class: ");
            String input = sc.nextLine();
            try {
                num = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        // Create outer and inner class objects
        Outer outer = new Outer();
        Outer.Inner in = outer.new Inner();
        in.show(num);

        // Footer
        System.out.println("\nLab No.: 1");
        System.out.println("Name: Sulav Adhikari");
        System.out.println("Roll No: 23081003");

        sc.close();
    }
}
