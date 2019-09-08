package tutorial_02;

public class Cylinder {

	public static void main(String[] args) {
		// declare the variables
		double radius = 5.0;
		double length = 30;
		double area, volume;
		
		// compute the formula
		area = radius * radius * Math.PI;
		volume = area * length;
		
		// print out the answer
		System.out.println("Volume of the cylinder: " + volume);
	}

}
