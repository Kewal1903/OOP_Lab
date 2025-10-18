package Week6;
import java.util.Scanner;
class StringAnalysis{
	int countCharacters(String input) {
		return input.length();
	}
	int countWords(String input) {
		return input.split(" ").length;
	}
	int countLines(String input) {
		return input.split(".").length;
	}
	int countVowels(String input) {
		int vowelCount = 0;
		for(int i = 0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				vowelCount++;
		}
		return vowelCount;
	}
}
public class StringCounts {
	public static void main(String[] args) {
		StringAnalysis s1 = new StringAnalysis();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		System.out.println("The number of characters in the string is: "+ s1.countCharacters(input));
		System.out.println("The number of words in the string is: "+ s1.countWords(input));
		System.out.println("The number of lines in the string is: "+ s1.countLines(input));
		System.out.println("The number of vowels in the string is: "+s1.countVowels(input));
	}
}
