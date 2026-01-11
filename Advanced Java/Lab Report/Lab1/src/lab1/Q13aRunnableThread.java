package lab1;

class A implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Thread");
    }
}

public class Q13aRunnableThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new A());
        t.start();
        t.join();   // wait for thread to finish

        System.out.print("Lab1, Sulav Adhikari, 2381003");
    }
}
