package lab1;

class StaticBlockDemo {
    static {
        System.out.println("Static block executed.");
    }

    void display() {
        System.out.println("Instance method called.");
    }
}

public class Q5cStaticBlock{
    public static void main(String[] args) {
        StaticBlockDemo obj = new StaticBlockDemo();
        obj.display();

        // Footer
        System.out.println("\nLab1, Sulav Adhikari,23081003");
    }
}
