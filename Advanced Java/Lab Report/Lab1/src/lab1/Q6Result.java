package lab1;

import java.util.Scanner;

// Class 1: Student
class Student {
    int roll_no;

    void readRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        roll_no = sc.nextInt();
    }

    void displayRoll() {
        System.out.println("Roll Number: " + roll_no);
    }
}

// Class 2: Test (inherits Student)
class Test extends Student {
    int mark1, mark2;

    void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        mark2 = sc.nextInt();
    }

    void displayMarks() {
        System.out.println("Marks of Subject 1: " + mark1);
        System.out.println("Marks of Subject 2: " + mark2);
    }
}

// Class 3: Result (inherits Test)
public class Q6Result extends Test {
    int total;

    void calculateTotal() {
        total = mark1 + mark2;
    }

    void displayResult() {
        displayRoll();
        displayMarks();
        System.out.println("Total Marks: " + total);
    }

    public static void main(String[] args) {

        // Create object of Q6Result class
        Q6Result r = new Q6Result();

        // Calling methods
        r.readRoll();
        r.readMarks();
        r.calculateTotal();
        r.displayResult();
    }
}
