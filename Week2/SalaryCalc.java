package Week2;
import java.util.Scanner;
public class SalaryCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double hours,rate,salary = 0;
		System.out.println("Enter number of hours worked: ");
		hours = sc.nextFloat();
		System.out.println("Enter the hourly rate: ");
		rate = sc.nextFloat();
		if(hours>=0) {
			if(hours<=40)
				salary = hours*rate;
			else if(hours>40) {
					double extra = (hours-40);
					salary = extra*1.5*rate + hours*rate;
					}
			System.out.println("Salary is "+ salary);
		}
		else
			System.out.println("Invalid hours.");
		
	}

}
