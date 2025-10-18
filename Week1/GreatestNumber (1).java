package Week1;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,max_no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		System.out.println("Enter third number: ");
		c = sc.nextInt();
		d = Math.max(a, b);
		max_no = Math.max(c, d);
		System.out.println("The greatest number is: "+max_no);
	}

}
