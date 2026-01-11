package lab1;

import java.util.Scanner;

class Shape {
    double area(double x) {
        return 0;
    }
}

class Circle extends Shape {
    double area(double r) {
        return 3.14 * r * r;
    }
}

class Square extends Shape {
    double area(double s) {
        return s * s;
    }
}

public class Q8bRuntimePolymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s;

        // Circle input
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        s = new Circle();
        System.out.println("Area of Circle: " + s.area(radius));

        // Square input
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        s = new Square();
        System.out.println("Area of Square: " + s.area(side));

        System.out.println("Lab1,23081003,Sulav Adhikari");

        sc.close();
    }
}
