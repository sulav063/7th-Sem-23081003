package lab1;

import java.util.Scanner;

interface Shape {
    double area(double x, double y);
    double perimeter(double x, double y);
}

class Rectangle implements Shape {
    public double area(double l, double b) {
        return l * b;
    }

    public double perimeter(double l, double b) {
        return 2 * (l + b);
    }
}

public class Q11Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Rectangle r = new Rectangle();
        System.out.println("Area: " + r.area(length, breadth));
        System.out.println("Perimeter: " + r.perimeter(length, breadth));

        System.out.println("\nLab1\n23081003\nSulav Adhikari");

        sc.close();
    }
}
