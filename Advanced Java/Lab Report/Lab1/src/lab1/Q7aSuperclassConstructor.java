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
        System.out.println("\nLab No.: 1");
        System.out.println("Name: Sulav Adhikari");
        System.out.println("Roll No: 23081003");
    }
}
