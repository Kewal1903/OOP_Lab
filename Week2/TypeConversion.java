package Week2;
import java.util.Scanner;
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1,i2,i3;
		double d1;
		char c1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		i1 = sc.nextInt();
		System.out.println("Enter a double value: ");
		d1 = sc.nextDouble();
		System.out.println("Enter a character: ");
		c1 = sc.next().charAt(0);
		byte b1 = (byte) i1;
		System.out.println("Converted integer "+i1+" to byte "+b1);
		i2 = (int)c1;
		System.out.println("Converted character "+c1+" to integer "+i2);
		byte b2 = (byte)d1;
		System.out.println("Converted double "+d1+" to byte "+b2);
		i3 = (int)d1;
		System.out.println("Converted double "+d1+" to integer "+i3);
		
	}

}
