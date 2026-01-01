package lab1;

import java.util.Scanner;

interface Shape1 {
    void area(double x, double y);
    void perimeter(double x, double y);
}

class RectangleShape implements Shape1 {
    double areaValue, perimeterValue;

    @Override
    public void area(double length, double breadth) {
        areaValue = length * breadth;
        System.out.println("Rectangle Area: " + areaValue);
    }

    @Override
    public void perimeter(double length, double breadth) {
        perimeterValue = 2 * (length + breadth);
        System.out.println("Rectangle Perimeter: " + perimeterValue);
    }
}

public class Q8dInterfaceMultiInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        RectangleShape rect = new RectangleShape();
        rect.area(length, breadth);
        rect.perimeter(length, breadth);

        // Footer
        System.out.println("\nLab No.: 1");
        System.out.println("Name: Sulav Adhikari");
        System.out.println("Roll No: 23081003");

        sc.close();
    }
}
