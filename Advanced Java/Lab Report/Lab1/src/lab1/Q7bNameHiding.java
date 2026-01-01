package lab1;

class Parent2 {
    int x = 10;
}

class Child2 extends Parent2 {
    int x = 20;
    void display() {
        System.out.println("Child x = " + x);
        System.out.println("Parent x = " + super.x);
    }
}

public class Q7bNameHiding{
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.display();

        // Footer
        System.out.println("\nLab No.: 1");
        System.out.println("Name: Sulav Adhikari");
        System.out.println("Roll No: 23081003");
    }
}
