package Week10;
import java.io.*;
import java.util.Scanner;
class FileOperations {
    public void writeFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }
    }
    public void readFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
    public void copyFile(String source, String destination) throws IOException {
        try (FileInputStream in = new FileInputStream(source);
             FileOutputStream out = new FileOutputStream(destination)) {
            int byteData;
            while ((byteData = in.read()) != -1) {
                out.write(byteData);
            }
        }
    }
}
public class FileReadAndCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileOperations fileOps = new FileOperations();
        System.out.println("Choose an option:");
        System.out.println("1. Write to a file");
        System.out.println("2. Read from a file");
        System.out.println("3. Copy bytes from one file to another");
        int choice = sc.nextInt();
        try {
            switch (choice) {
                case 1:
                    System.out.println("Enter the filename to write to:");
                    String writeFile = sc.nextLine();
                    System.out.println("Enter the content to write:");
                    String content = sc.nextLine();
                    fileOps.writeFile(writeFile, content);
                    System.out.println("Content written to " + writeFile);
                    break;
                case 2:
                    System.out.println("Enter the filename to read from:");
                    String readFile = sc.nextLine();
                    fileOps.readFile(readFile);
                    break;
                case 3:
                    System.out.println("Enter the source filename:");
                    String sourceFile = sc.nextLine();
                    System.out.println("Enter the destination filename:");
                    String destFile = sc.nextLine();
                    fileOps.copyFile(sourceFile, destFile);
                    System.out.println("File copied from " + sourceFile + " to " + destFile);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
