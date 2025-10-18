package Week7;
import java.util.Scanner;
class StudentMarks{
	int id;
	int[] marks = new int[5];
	StudentMarks(int id, int[] marks) {
		this.id = id;
		for(int i=0; i<5; i++)
			this.marks[i] = marks[i];
}}
class StudentInfo extends StudentMarks{
	StudentInfo(int id, int[] marks) {
		super(id, marks);
	}
	int TotalMarks() {
		int total = 0;
		for(int i=0; i<5; i++)
			total += marks[i];
		return total;
	}
	boolean isPassed() {
		for(int i=0; i<5; i++) {
			if (marks[i] < 40)
				return false;
		}
		return true;
	}
	void PrintResult() {
		System.out.println("Student ID: "+ id);
		System.out.println("Total Marks: "+ TotalMarks());
		if (isPassed())
			System.out.println("The student has passed.");
		else
			System.out.println("The student has failed.");
	}
}
public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student ID: ");
		int id = sc.nextInt();
		int[] marks = new int[5];
		System.out.println("Enter Marks for 5 subjects(out of 100): ");
		for(int i=0; i<5; i++)
			marks[i] = sc.nextInt();
		StudentInfo student = new StudentInfo(id,marks);
		student.PrintResult();
	}
}