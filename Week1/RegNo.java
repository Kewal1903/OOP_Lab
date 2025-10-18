package Week1;
import java.util.Scanner;
public class RegNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reg_no,year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 9 digit registration number: ");
		reg_no = sc.nextInt();
		if (reg_no>=100000000 && reg_no<=999999999) {
			year = reg_no/10000000;
			System.out.println("The year of joining is: 20"+year);	
	}
		else 
			System.out.println("Invalid registration number.");

}}
