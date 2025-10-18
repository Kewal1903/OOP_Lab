package Week1;
import java.util.Scanner;
public class RetirementDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bdate,bmonth,byear,retirement_year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date of birth: ");
		bdate = sc.nextInt();
		if (bdate <0 || bdate >31)
			System.out.println("Invalid month");
		System.out.println("Enter month of birth: ");
		bmonth = sc.nextInt();
		if (bmonth <0 || bmonth >31)
			System.out.println("Invalid month");
		System.out.println("Enter year of birth: ");
		byear = sc.nextInt();
		System.out.println("Date of birth is: "+bdate+"/"+bmonth+"/"+byear);
		retirement_year = byear + 60;
		System.out.println("Date of retirement is: "+bdate+"/"+bmonth+"/"+retirement_year);
	
	}

}
