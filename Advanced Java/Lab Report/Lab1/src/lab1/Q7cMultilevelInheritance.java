package lab1;

class A1 {
    A1() {
        System.out.println("A1 constructor");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("B1 constructor");
    }
}

class C1 extends B1 {
    C1() {
        System.out.println("C1 constructor");
    }
}

public class Q7cMultilevelInheritance {
    public static void main(String[] args) {

        // Creating object of child class
        C1 obj = new C1(); // shows constructor call order

        // Footer
        System.out.println("\nLab1, Sulav Adhikari,23081003");
    }
}
