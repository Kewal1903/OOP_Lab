package Week6;
import java.util.Scanner;
class Q4operations{
	boolean compareStrings(String str1, String str2) {
		return str1.equals(str2);
	}
	String swapCase(String input) {
		String swapped = "";
		for(int i = 0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch))
				swapped += Character.toLowerCase(ch);
			else if(Character.isLowerCase(ch))
				swapped += Character.toUpperCase(ch);
			else
				swapped += ch;	
		}
		return swapped;
	}
	boolean isSubstring(String mainString, String subString) {
		return mainString.contains(subString);
	}
	String replaceSubstring(String mainString, String subString) {
		if (mainString.contains(subString))
			return mainString.replace(subString,"Hello");
		return mainString;
	}
}
public class Q4 {
	public static void main(String[] args) {
		Q4operations ops = new Q4operations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Compare two strings: ");
		System.out.println("2. Convert uppercase characters to lowercase characters and vice versa.");
		System.out.println("3. Check if a string contains a particular substring.");
		System.out.println("4. Replace a substring of a string with Hello.");
		System.out.println("5. Exit");
		while(true) {
			System.out.println("Enter your choice: ");
			int n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("Enter 1st string to compare: ");
				String str1 = sc.next();
				System.out.println("Enter 2nd string to compare: ");
				String str2 = sc.next();
				if (ops.compareStrings(str1,str2))
					System.out.println("Strigs are equal.");
				else
					System.out.println("Strings are not equal.");
				break;
			case 2:
				System.out.println("Enter string for case conversion: ");
				String input = sc.next();
				System.out.println("Converted string: "+ ops.swapCase(input));
				break;
			case 3:
				System.out.println("Enter main string: ");
				String mainString = sc.next();
				System.out.println("Enter sub string: ");
				String subString = sc.next();
				if (ops.isSubstring(mainString,subString))
					System.out.println("The substring is found in the main string.");
				else
					System.out.println("The substring is not found in the main string.");
				break;
			case 4:
				System.out.println("Enter the main string: ");
				String mainStr = sc.next();
				System.out.println("Enter the substring: ");
				String subStr = sc.next();
				System.out.println("Resulting string: "+ ops.replaceSubstring(mainStr, subStr));
				break;
			case 5:
				return;
			default:
				System.out.println("Invalid input");
		}
	}
}}
