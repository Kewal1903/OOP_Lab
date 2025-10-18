package Week5;
class boxCreation{
	
	double width, height, depth;

	void setDims(double width, double height, double depth) {
		if (width < 0 || height < 0 || depth < 0) {
			System.out.println("Incorrect input.");
		}
		else {
		this.width = width;
		this.height = height;
		this.depth = depth;
		System.out.println("Setting dimensions of the box as: "+width+","+height+","+depth);
		}}
	
	double volume() {
		double volume = width*height*depth;
		System.out.println("The volume of the box is: " + volume);
		return volume;
	}
	
}
public class Box {
	
	public static void main(String[] args) {
		boxCreation myBox = new boxCreation();
		myBox.setDims(5, 10, 15);
		myBox.volume();
	}

}
