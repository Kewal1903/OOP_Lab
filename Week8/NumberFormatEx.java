package Week8;
import java.util.Scanner;
class NumberOperations {
    private String[] inputs = new String[4];
    private Integer[] numbers = new Integer[4];
    private int count = 0;
    public void readInputs() {
        Scanner sc = new Scanner(System.in);
        while (count < 4) {
            System.out.println("Enter a number: ");
            inputs[count] = sc.nextLine();
            count++;
        }
    }
    public void convertToNumbers() {
        for (int i = 0; i < inputs.length; i++) {
            try {
                numbers[i] = Integer.parseInt(inputs[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + inputs[i]);
                numbers[i] = null;
            }
        }
    }
    public void displayNumbers() {
        System.out.println("Valid numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != null) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}
public class NumberFormatEx {
    public static void main(String[] args) {
        NumberOperations operations = new NumberOperations();
        operations.readInputs();
        operations.convertToNumbers();
        operations.displayNumbers();
    }
}
