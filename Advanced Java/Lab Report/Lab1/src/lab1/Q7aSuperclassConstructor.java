package lab1;

class Parent {
    Parent() { System.out.println("Parent constructor called"); }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child constructor called");
    }
}

public class Q7aSuperclassConstructor {
    public static void main(String[] args) {
        Child c = new Child();

        // Footer
        System.out.println("\nLab1, Sulav Adhikari,23081003");
    }
}
