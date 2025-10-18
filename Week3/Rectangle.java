package Week3;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,b,area=0,circ=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter length of the rectangle: ");
		l = sc.nextInt();
		System.out.println("\n Enter breadth of the rectangle: ");
		b = sc.nextInt();
		if (l>0 && b>0) {
			area = l*b;
			circ = 2*(l+b);
			System.out.println("\n The area of the rectangle is: "+area);
			System.out.println("\n The circumference of the rectangle is: "+circ);
		}
		else
			System.out.println("\n Invalid inputs for length and breadth.");
		
		
		

	}

}
