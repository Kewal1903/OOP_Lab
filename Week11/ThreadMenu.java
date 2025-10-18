package Week11;
import java.util.Scanner;
class RunnableThread implements Runnable {
    public void run() {
        System.out.println("Runnable thread is running...");
    }
}
class InheritedThread extends Thread {
    public void run() {
        System.out.println("Thread class thread is running...");
    }
}
public class ThreadMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create thread using Runnable");
            System.out.println("2. Create thread using Thread class");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Thread t1 = new Thread(new RunnableThread());
                    t1.start();
                    break;
                case 2:
                    InheritedThread t2 = new InheritedThread();
                    t2.start();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
