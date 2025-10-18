package Week2;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i1;
		String s1;
		System.out.println("Enter a string: ");
		s1 = sc.nextLine();
		System.out.println("Enter an integer: ");
		i1 = sc.nextInt();
		String tempstr = s1;
		int tempint = i1;
		s1 = Integer.toString(tempint);
		i1 = Integer.parseInt(tempstr);
		System.out.println("Converted integer is: "+i1);
		System.out.println("Converted string is: "+s1);
		
	}

}
