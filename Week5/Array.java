package Week5;
import java.util.Scanner;
class ArrayClass {
    private int[] arr;
    public ArrayClass() {
        this.arr = new int[0];
    }
    public ArrayClass(int[] arr) {
        this.arr = arr;
    }
    public void print() {
        if (arr.length == 0) {
            System.out.println("The array is empty.");
        } else {
            System.out.print("Array contents: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public boolean search(int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }
    public boolean compare(ArrayClass otherArray) {
        if (this.arr.length != otherArray.arr.length) {
            return false;
        }

        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] != otherArray.arr[i]) {
                return false;
            }
        }
        return true;
    }
}

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }
        ArrayClass arr1 = new ArrayClass(array1);
        ArrayClass arr2 = new ArrayClass(array2);
        System.out.println("\nFirst array:");
        arr1.print();
        System.out.println("Second array:");
        arr2.print();
        System.out.print("\nEnter the element to search in the first array: ");
        int elementToSearch = sc.nextInt();
        if (arr1.search(elementToSearch)) {
            System.out.println("Element found in the first array.");
        } else {
            System.out.println("Element not found in the first array.");
        }
        if (arr1.compare(arr2)) {
            System.out.println("\nThe two arrays are equal.");
        } else {
            System.out.println("\nThe two arrays are not equal.");
        }
        sc.close();
    }
}