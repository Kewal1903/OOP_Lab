package Week3;
import java.util.Scanner;
public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter number corresponding to date:- ");
		date = sc.nextInt();
		if (date == 1)
			System.out.println("Monday");
		else if (date == 2)
			System.out.println("Tuesday");
		else if (date == 3)
			System.out.println("Wednesday");
		else if (date == 4)
			System.out.println("Thursday");
		else if (date == 5)
			System.out.println("Friday");
		else if (date == 6)
			System.out.println("Saturday");
		else if (date == 7)
			System.out.println("Sunday");
		else
			System.out.println("Invalid input.");
	}
}
