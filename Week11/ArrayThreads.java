package Week11;
import java.util.*;
class UnionThread extends Thread {
    private int[] arr1, arr2;
    UnionThread(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }
    public void run() {
        List<Integer> unionList = new ArrayList<>();
        for (int num : arr1) {
            if (!unionList.contains(num)) {
                unionList.add(num);
            }
        }
        for (int num : arr2) {
            if (!unionList.contains(num)) {
                unionList.add(num);
            }
        }
        System.out.println("Union: " + unionList);
    }
}
class IntersectionThread extends Thread {
    private int[] arr1, arr2;

    IntersectionThread(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }
    public void run() {
        List<Integer> intersectionList = new ArrayList<>();
        for (int num : arr1) {
            for (int num2 : arr2) {
                if (num == num2 && !intersectionList.contains(num)) {
                    intersectionList.add(num);
                    break;
                }
            }
        }

        System.out.println("Intersection: " + intersectionList);
    }
}
public class ArrayThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arrays:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter elements for Arr1:");
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        System.out.println("Enter elements for Arr2:");
        for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();
        UnionThread t1 = new UnionThread(arr1, arr2);
        IntersectionThread t2 = new IntersectionThread(arr1, arr2);
        t1.start();
        t2.start();
    }
}
