package Week10;
import java.io.*;
import java.util.Scanner;
class FileStatistics {
    public void countFileStats(String filename) throws IOException {
        int charCount = 0, vowelCount = 0, lineCount = 0, wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s+").length;
                for (char c : line.toLowerCase().toCharArray()) {
                    if ("aeiou".indexOf(c) != -1) vowelCount++;
                }
            }
        }
        System.out.println("File Statistics:");
        System.out.println("Characters: " + charCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
    }
}
public class LetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileStatistics stats = new FileStatistics();
        System.out.println("Enter the filename to analyze:");
        String filename = sc.nextLine();
        try {
            stats.countFileStats(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

