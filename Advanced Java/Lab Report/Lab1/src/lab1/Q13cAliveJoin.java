package lab1;

class C extends Thread {
    public void run() {
        System.out.println("Running");
    }
}

public class Q13cAliveJoin {
    public static void main(String[] args) throws Exception {
        C t = new C();
        t.start();
        t.join();
        System.out.println(t.isAlive());
        System.out.print("\nLab1,Sulav Adhikari ,2381003");
    }
}
