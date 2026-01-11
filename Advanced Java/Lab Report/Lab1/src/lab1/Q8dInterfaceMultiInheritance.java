package lab1;

interface A {
    void showA();
}

interface B {
    void showB();
}

class Demo implements A, B {
    public void showA() {
        System.out.println("A method"); 
    }
    public void showB() { 
        System.out.println("B method");
    }
}

public class Q8dInterfaceMultiInheritance {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.showA();
        d.showB();

        System.out.println("\nLab1,23081003,Sulav Adhikari");

    }
}
