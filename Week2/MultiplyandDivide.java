package Week2;
import java.util.Scanner;
public class MultiplyandDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number,n;
		System.out.println("Enter number to be operated upon: ");
		number = sc.nextInt();
		System.out.println("Enter n: ");
		n = sc.nextInt();

        
        int resultMultiplication = number << n;
        System.out.println("Multiplying " + number + " by 2^" + n + " results in: " + resultMultiplication);

 
        int resultDivision = number >> n;
        System.out.println("Dividing " + number + " by 2^" + n + " results in: " + resultDivision);

	}

}
