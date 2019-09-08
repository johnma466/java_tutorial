package tutorial_02;

import java.util.Scanner;

public class CylinderUsingScanner {

	public static void main(String[] args) {
		// declare the variables
		double radius, length, area, volume;
		Scanner input;
		
		// to prompt the user to enter the value of radius 
		input = new Scanner(System.in);
		System.out.print("Enter radius of the cylinder: ");
		radius = input.nextDouble();
		
		// to prompt ... length
		input = new Scanner(System.in);
		System.out.print("Enter length of the cylinder: ");
		length = input.nextDouble();

		// compute the formula
		area = radius * radius * Math.PI;
		volume = area * length;
		
		// print out the answer
		System.out.println("Volume of the cylinder: " + volume);

	}

}
