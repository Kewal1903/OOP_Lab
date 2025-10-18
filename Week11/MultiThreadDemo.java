package Week11;
class Task extends Thread {
    private String taskName;
    public Task(String name) {
        this.taskName = name;
    }
    public void run() {
        System.out.println(taskName + " is running.");
    }
}
public class MultiThreadDemo {
    public static void main(String[] args) {
        Task t1 = new Task("Task 1");
        Task t2 = new Task("Task 2");
        Task t3 = new Task("Task 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
