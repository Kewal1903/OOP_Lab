package Week11;
class SyncBlockCounter {
    private int count = 0;
    public void increment() {
        synchronized (this) {
            count++;
        }
    }
    public int getCount() {
        return count;
    }
}
class SyncBlockThread extends Thread {
    private SyncBlockCounter counter;
    public SyncBlockThread(SyncBlockCounter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
public class SyncBlockDemo {
    public static void main(String[] args) throws InterruptedException {
        SyncBlockCounter counter = new SyncBlockCounter();
        SyncBlockThread t1 = new SyncBlockThread(counter);
        SyncBlockThread t2 = new SyncBlockThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final count: " + counter.getCount());
    }
}

