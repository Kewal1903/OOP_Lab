package Week10;
import java.io.*;
import java.util.Scanner;
class DirectoryOperations {
    public void displayFiles(String dirPath) {
        File dir = new File(dirPath);
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null && files.length > 0) {
                System.out.println("Files and directories in '" + dirPath + "':");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}
public class FileDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DirectoryOperations dirOps = new DirectoryOperations();
        System.out.println("Enter the directory path:");
        String dirPath = sc.nextLine();
        dirOps.displayFiles(dirPath);
    }
}

