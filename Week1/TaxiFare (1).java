package Week1;
import java.util.Scanner;
public class TaxiFare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float taxi_fare, distance = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter taxi fare of journey: ");
		taxi_fare = sc.nextFloat();
		if (taxi_fare<= 0) 
			System.out.println("Error.");
		else if(taxi_fare >0 && taxi_fare<=50)
			distance = taxi_fare/10;
		else if(taxi_fare >50 && taxi_fare<=170)
			distance = 5 + (taxi_fare-50)/8;
		else
			distance = 20 + (taxi_fare-170)/5;
		System.out.println("The distance is: "+distance+"kms");

	}

}
