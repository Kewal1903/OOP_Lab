package Week8;
import java.util.Scanner;
class Student {
    private String name;
    private String rollNumber;
    private int[] marks = new int[3];
    private double percentage;
    private String grade;
    public void readDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        name = sc.nextLine();
        System.out.println("Enter roll number: ");
        rollNumber = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.println("Enter marks for subject " + (i + 1) + ": ");
                String input = sc.nextLine();
                try {
                    marks[i] = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter numeric values for marks.");
                }
            }
        }
    }
    public void calculatePercentageAndGrade() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        percentage = total / 3.0;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\nPercentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();
        student.readDetails();
        student.calculatePercentageAndGrade();
        student.displayDetails();
    }
}
