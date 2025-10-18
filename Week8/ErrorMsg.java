package Week8;
import java.util.Scanner;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
class Test {
    public void validate(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Negative values are not allowed.");
        }
    }
}
public class ErrorMsg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test test = new Test();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            try {
                test.validate(num);
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
