package lab1;

import java.util.Scanner;

class Shape {
    void area() {
        System.out.println("Area not defined");
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    @Override
    void area() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Square extends Shape {
    double side;
    Square(double side) { this.side = side; }
    @Override
    void area() {
        System.out.println("Square Area: " + (side * side));
    }
}

public class Q8bRuntimePolymorphism {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Shape s1 = new Circle(radius);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        Shape s2 = new Square(side);

        // Runtime polymorphism demonstration
        s1.area();
        s2.area();

        // Footer
        System.out.println("\nLab No.: 1");
        System.out.println("Name: Sulav Adhikari");
        System.out.println("Roll No: 23081003");

        sc.close();
    }
}
