package lab1;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Thread");
    }
}

public class Q13aRunnableThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyRunnable());
        t.start();
        t.join();

        System.out.print("Lab1, Sulav Adhikari, 2381003");
    }
}
