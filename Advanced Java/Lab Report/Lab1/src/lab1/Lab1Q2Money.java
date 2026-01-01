package lab1;

import java.util.Scanner;

class Money {
    int rupee, paisa;

    void setMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rupees: ");
        rupee = sc.nextInt();
        System.out.print("Enter paisa: ");
        paisa = sc.nextInt();
    }

    void displayMoney() {
        System.out.println(rupee + " Rupee, " + paisa + " Paisa");
    }

    void addMoney(Money m1, Money m2) {
        int totalPaisa = m1.paisa + m2.paisa;
        rupee = m1.rupee + m2.rupee + (totalPaisa / 100);
        paisa = totalPaisa % 100;
    }
}

public class Lab1Q2Money {
    public static void main(String[] args) {
        Money m1 = new Money();
        Money m2 = new Money();
        Money m3 = new Money();

        System.out.println("Enter Money 1:");
        m1.setMoney();
        System.out.println("Enter Money 2:");
        m2.setMoney();

        m3.addMoney(m1, m2);

        System.out.println("\nMoney 1:");
        m1.displayMoney();
        System.out.println("Money 2:");
        m2.displayMoney();
        System.out.println("Sum:");
        m3.displayMoney();

        // Footer
        System.out.println("\nLab No.: 1");
        System.out.println("Name: Sulav Adhikari");
        System.out.println("Roll No: 23081003");
    }
}
