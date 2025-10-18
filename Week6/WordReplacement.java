package Week6;
import java.util.Scanner;
class WordReplacer {
    String ReplaceWord(String input, String replacementStr) {
        int[] count = new int[256];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            count[ch]++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (count[ch] > 1) {
                result.append(replacementStr);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
public class WordReplacement {
    public static void main(String[] args) {
        WordReplacer w1 = new WordReplacer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Enter the replacement word: ");
        String replacementStr = sc.nextLine();
        System.out.println("Replaced word is: " + w1.ReplaceWord(input, replacementStr));
    }
}
