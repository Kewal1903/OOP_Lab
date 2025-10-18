package Week8;
import java.util.Scanner;
class ArrayOverflowException extends Exception {
    public ArrayOverflowException(String message) {
        super(message);
    }
}
class ArrayOps {
    private int[] array = new int[3];
    private int count = 0;
    public void addNumber(int number) throws ArrayOverflowException {
        if (count >= array.length) {
            throw new ArrayOverflowException("Array Overflow: Cannot add more elements.");
        }
        array[count] = number;
        count++;
    }
    public void displayArray() {
        System.out.println("Array elements are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
public class ArrayOverflowEx {
    public static void main(String[] args) {
        ArrayOps operations = new ArrayOps();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to add: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            try {
                operations.addNumber(num);
            } catch (ArrayOverflowException e) {
                System.out.println(e.getMessage());
            }
        }
        operations.displayArray();
    }
}
