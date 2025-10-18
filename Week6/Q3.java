package Week6;
import java.util.Arrays;
import java.util.Scanner;
class Q3operations{
	String reversed(String input) {
		String reversed = "";
		for (int i = input.length()-1; i >= 0; i--)
			reversed += input.charAt(i);
		return reversed;
	}
	boolean isPalindrome(String input) {
		String reversed = reversed(input);
		return input.equals(reversed);
	}
	String sortAlphabetically(String input) {
		char [] chars = input.toLowerCase().toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	String concat(String input) {
		String reversed = reversed(input);
		return input+reversed;
	}
}
public class Q3 {
	public static void main(String[] args) {
		Q3operations ops = new Q3operations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();	
		System.out.println("Menu");
		System.out.println("1. Check whether string is palindrome or not. ");
		System.out.println("2. Sort the alphabets of the string and return the sorted string.");
		System.out.println("3. Return the reversed string.");
		System.out.println("4. Concatenate and return the string with its reversed form.");
		System.out.println("5. Exit");
		while(true) {
			System.out.println("Enter your choice: ");
			int n = sc.nextInt();
			switch(n) {
			case 1:
				if (ops.isPalindrome(input) == true)
					System.out.println("The string is a palindrome.");
				else
					System.out.println("The string is not a palindrome.");
				break;
			case 2:
				System.out.println("The string sorted alphabetically is: " + ops.sortAlphabetically(input));
				break;
			case 3:
				System.out.println("The reversed string is: "+ ops.reversed(input));
				break;
			case 4:
				System.out.println("The string and its reversed form is: "+ ops.concat(input));
				break;
			case 5:
				return;
			default:
				System.out.println("Invalid input.");
			}}
	}
}
