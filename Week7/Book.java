package Week7;
import java.util.Scanner;
class BookInfo {
	int id;
	String name;
	double price;
	BookInfo(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
class InfoRetrieval extends BookInfo{
	InfoRetrieval(int id, String name, double price){
		super(id, name, price);
	}
	int getID() {
		return id;
	}
	String getName() {
		return name;
	}
	double getPrice() {
		return price;
	}
}
public class Book {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Book ID: ");
		int id = sc.nextInt();
		System.out.println("Enter Book Name: ");
		String name = sc1.nextLine();
		System.out.println("Enter Book Price: ");
		double price = sc.nextDouble();
		InfoRetrieval book = new InfoRetrieval(id, name, price);
		System.out.println("ID of the Book is: "+book.getID());
		System.out.println("Name of the Book is: "+book.getName());
		System.out.println("Price of the Book is: "+book.getPrice());
	}
}