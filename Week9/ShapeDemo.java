package Week9;
import java.util.Scanner;
interface Shape{
	double area();
	double perimeter();
}
class Circle implements Shape{
	private double radius;
	public Circle(double radius) {
		if(radius <= 0) {
			throw new IllegalArgumentException("Radius must be positive.");
		}
		this.radius = radius;
	}
	public double area() {
		return Math.PI*radius*radius;
	}
	public double perimeter() {
		return Math.PI*2*radius;
	}
}
class Rectangle implements Shape{
	private double length;
	private double breadth;
	public Rectangle(double length, double breadth) {
		if(length <= 0 || breadth <= 0) {
			throw new IllegalArgumentException("Length and breadth must be positive.");
		}
		this.length = length;
		this.breadth = breadth;
	}
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length + breadth);
	}
}
public class ShapeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter radius of circle: ");
			double radius = sc.nextDouble();
			Circle circle = new Circle(radius);
			System.out.println("The area of the circle is: " + circle.area());
			System.out.println("The circumference of the circle is: " + circle.perimeter());
			System.out.println("Enter the length of the rectangle: ");
			double length = sc.nextDouble();
			System.out.println("Enter the breadth of the rectangle: ");
			double breadth = sc.nextDouble();
			Rectangle rectangle = new Rectangle(length, breadth);
			System.out.println("The area of the rectangle is: " + rectangle.area());
			System.out.println("The perimeter of the rectangle is: " + rectangle.perimeter());
		}catch(IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}	
	}
}
