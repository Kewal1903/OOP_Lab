package Week7;
import java.util.Scanner;
abstract class Figure{
	double dim1, dim2;
	Figure(double a, double b){
		dim1 = a; dim2 = b;
	}
	abstract double area();
}
class Square extends Figure{
	Square(double a){
		super(a,a);
	}
	double area() {
		return dim1*dim2;
	}
}
class Triangle extends Figure{
	Triangle(double a, double b){
		super(a,b);
	}
	double area() {
		return dim1*dim2/2;
	}
}
public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of square: ");
		double a = sc.nextDouble();
		Square s1 = new Square(a);
		Figure fig;
		fig = s1;
		System.out.println("The area of the square is: "+ fig.area());
		System.out.println("Enter base length of triangle: ");
		double b = sc.nextDouble();
		System.out.println("Enter height of triangle: ");
		double h = sc.nextDouble();
		Triangle t1 = new Triangle(b,h);
		fig = t1;
		System.out.println("The area of the triangle is: "+ t1.area());
	}
}