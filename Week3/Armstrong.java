package Week3;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,num,sum=0,org_num;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter a number: ");
		num = sc.nextInt();
		org_num = num;
		if (num>0) {
			while (num>0) {
				rem = num%10;
				sum = sum + (rem*rem*rem);
				num = num/10;
			}
			if (org_num == sum)
				System.out.println(org_num+" is an Armstrong number.");
			else
				System.out.println(org_num+" is not an Armstrong number.");
	}
		else 
			System.out.println("\n Enter positive number.");
}}

