package Week8;
import java.util.Scanner;
class Invalid_File_Extn extends Exception {
    public Invalid_File_Extn(String message) {
        super(message);
    }
}
class FileOperations {
    private String[] filenames = new String[3];
    private int count = 0;
    public void readInputs() {
        Scanner sc = new Scanner(System.in);
        while (count < 3) {
            System.out.println("Enter filename with extension: ");
            filenames[count] = sc.nextLine();
            count++;
        }
    }
    public void checkExtensions() throws Invalid_File_Extn {
        String firstExt = getExtension(filenames[0]);
        for (int i = 1; i < filenames.length; i++) {
            if (!getExtension(filenames[i]).equals(firstExt)) {
                throw new Invalid_File_Extn("Error: Files have different extensions.");
            }
        }
        System.out.println("All filenames have the same extension.");
    }
    private String getExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        return (dotIndex != -1) ? filename.substring(dotIndex + 1) : "";
    }
}
public class StringType {
    public static void main(String[] args) {
        FileOperations operations = new FileOperations();
        operations.readInputs();
        try {
            operations.checkExtensions();
        } catch (Invalid_File_Extn e) {
            System.out.println(e.getMessage());
        }
    }
}

