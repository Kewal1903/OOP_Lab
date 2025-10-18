package Week11;
class Counter {
    private int count = 0;
    public synchronized void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}
class SyncMethodThread extends Thread {
    private Counter counter;
    public SyncMethodThread(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
public class SyncMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        SyncMethodThread t1 = new SyncMethodThread(counter);
        SyncMethodThread t2 = new SyncMethodThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final count: " + counter.getCount());
    }
}
