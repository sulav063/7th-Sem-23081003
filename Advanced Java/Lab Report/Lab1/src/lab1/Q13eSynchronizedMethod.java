package lab1;

class Table {
    synchronized void print(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
    }
}

class MyThread extends Thread {
    Table t;
    int num;

    MyThread(Table t, int num) {
        this.t = t;
        this.num = num;
    }

    @Override
    public void run() {
        t.print(num);
    }
}

public class Q13eSynchronizedMethod {
    public static void main(String[] args) throws InterruptedException {
        Table t = new Table();

        MyThread t1 = new MyThread(t, 5);
        MyThread t2 = new MyThread(t, 10);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.print("Lab1, Sulav Adhikari, 2381003");
    }
}
