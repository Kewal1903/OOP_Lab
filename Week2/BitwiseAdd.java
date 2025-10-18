package Week2;
import java.util.Scanner;
public class BitwiseAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i1,i2;
		System.out.println("Enter a number: ");
		i1 = sc.nextInt();
		System.out.println("Enter another number: ");
		i2 = sc.nextInt();
		while (i2!= 0) {
            int carry = i1 & i2;
            i1 = i1 ^ i2;
            i2 = carry << 1;
        }
		if(i1%2 ==0){
		System.out.print("The number is even: "+i1+"\n");
		}
		else {
		System.out.print("The number is odd: "+i1);
		}
		
	}

}
