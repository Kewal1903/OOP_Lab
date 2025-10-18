package Week9; 
import java.util.Scanner;
interface Movable{
	void move(int x, int y);
}
interface Resizable{
	void resize(double scale);
}
class ShapeTransformer implements Movable, Resizable{
	private int x,y;
	private double size;
	public ShapeTransformer(int x, int y, double size) {
		if(size <= 0) {
			throw new IllegalArgumentException("Size must be positive.");
		}
		this.x = x;
		this.y = y;
		this.size = size;
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Moved to position : (" + x + ","+ y +")");
	}
	public void resize(double scale) {
		if(scale <= 0) {
			throw new IllegalArgumentException("Scaling factor must be positive.");
		}
		this.size = this.size * scale;
		System.out.println("Resized to size: " + size);
	}
	public void display() {
		System.out.println("Current position is : ("+ x + ","+ y +")");
		System.out.println("Current size is: " + size);
	}
}
public class TransformerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter initial x and y coordinates of shape: ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println("Enter initial size: ");
			double size = sc.nextDouble();
			ShapeTransformer shape = new ShapeTransformer(x, y, size);
			System.out.println("Initial specifications of shape are: ");
			shape.display();
			System.out.println("Enter coordinates to move the shape to: ");
			x = sc.nextInt();
			y = sc.nextInt();
			shape.move(x, y);
			System.out.println("Enter rescaling factor for shape: ");
			double scale = sc.nextDouble();
			shape.resize(scale);
		}catch(IllegalArgumentException e) {
			System.out.println("Error :" + e.getMessage());
		}
	}
}
