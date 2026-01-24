package lab1fresh;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Class");
    }
}

public class Q13bThreadClass {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();

        System.out.print("Lab1, Sulav Adhikari, 2381003");
    }
}
