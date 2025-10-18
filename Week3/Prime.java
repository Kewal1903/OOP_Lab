package Week3;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter a number: ");
		num = sc.nextInt();
		if(num>1) {
			for(i=2;i<num;i++) {
				if (num%i == 0)
					count++;
				else
					continue;
		}
			if (count>0)
				System.out.println("The number is composite.");
			else
				System.out.println("The number is prime.");
		}
		else
			System.out.println("Cannot test for negative numbers, 0 or 1");
	}
}
