package Week3;
import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter age of voter: ");
		age = sc.nextInt();
		if (age<0 || age>120) 
			System.out.println("\n Invalid age");
		else if (age>=0 && age<18)
			flag = 1;
		else
			flag = 2;
		switch(flag) {
		case 1:
			System.out.println("Person is ineligible to vote.");
			break;
		case 2:
			System.out.println("Person is eligible to vote.");
		}
	}
}
