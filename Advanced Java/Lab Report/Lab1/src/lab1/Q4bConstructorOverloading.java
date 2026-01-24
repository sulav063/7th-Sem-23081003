package lab1;

import java.util.Scanner;

class ConstructorOverload {
    int a, b;

    ConstructorOverload() {
        a = 0; b = 0;
    }

    ConstructorOverload(int x, int y) {
        a = x; b = y;
    }

    void display() {
        System.out.println("a=" + a + ", b=" + b);
    }
}

public class Q4bConstructorOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConstructorOverload obj1 = new ConstructorOverload();
        System.out.print("Enter values for constructor overloading: ");
        ConstructorOverload obj2 = new ConstructorOverload(sc.nextInt(), sc.nextInt());

        obj1.display();
        obj2.display();

        // Footer
        System.out.println("\nLab1, Sulav Adhikari,23081003");
    }
}
