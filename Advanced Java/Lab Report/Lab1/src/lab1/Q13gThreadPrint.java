package lab1;

public class Q13gThreadPrint extends Thread {
    @Override
    public void run() {
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Q13gThreadPrint t = new Q13gThreadPrint();
        t.start();
        t.join(); // wait for countdown to finish

        System.out.print("Lab1, Sulav Adhikari, 2381003");
    }
}
