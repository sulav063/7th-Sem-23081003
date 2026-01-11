package lab1;

import java.util.Scanner;

abstract class AbstractShape {
    abstract void area();
}

class TriangleShape extends AbstractShape {
    double base, height;

    TriangleShape(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

public class Q8cAbstractclass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        TriangleShape t = new TriangleShape(base, height);
        t.area();

        // Footer
        System.out.println("\nLab1,23081003,SulavAdhikari");

        sc.close();
    }
}
