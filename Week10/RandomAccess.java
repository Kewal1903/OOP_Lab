package Week10;
import java.io.*;
class RandomAccessFileOperations {
    public void writeToFile(String filename, String content) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(filename, "rw")) {
            raf.writeUTF(content);
        }
    }
    public void appendToFile(String filename, String content) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(filename, "rw")) {
            raf.seek(raf.length());
            raf.writeUTF(content);
        }
    }
    public void readFromFile(String filename) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(filename, "r")) {
            System.out.println(raf.readUTF());
        }
    }
}
public class RandomAccess {
    public static void main(String[] args) {
        RandomAccessFileOperations rafOps = new RandomAccessFileOperations();
        try {
            rafOps.writeToFile("randomfile.txt", "Initial Data");
            rafOps.appendToFile("randomfile.txt", "\nAppended Data");
            rafOps.readFromFile("randomfile.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
