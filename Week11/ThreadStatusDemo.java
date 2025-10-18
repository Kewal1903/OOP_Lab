package Week11;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}
public class ThreadStatusDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        if (t.isAlive()) {
            System.out.println("Thread is alive.");
        }
        t.join();
        System.out.println("Thread has finished execution.");
    }
}
