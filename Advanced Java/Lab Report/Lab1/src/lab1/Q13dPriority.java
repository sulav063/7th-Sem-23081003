package lab1;

public class Q13dPriority extends Thread {
    @Override
    public void run() {
        System.out.println(getPriority());
    }

    public static void main(String[] args) throws InterruptedException {
        Q13dPriority t = new Q13dPriority();
        t.setPriority(8);  // set thread priority
        t.start();
        t.join();           // wait for thread to finish

        System.out.print("Lab1, Sulav Adhikari, 2381003");
    }
}
