package Week2;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year;
		boolean leap;
		System.out.println("Enter a year: ");
		year = sc.nextInt();
		if(year>=0) {
			if (year%4 !=0)
				leap = false;
			else if (year%100 !=0)
				leap = true;
			else if (year%400 !=0)
				leap = false;
			else
				leap = true;
			if (leap == true)
				System.out.println(year+" is a leap year.");
			else
				System.out.println(year+" is not a leap year.");
			
		}
		else
			System.out.println("Invalid year.");
	}

}
