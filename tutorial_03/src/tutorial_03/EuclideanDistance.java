package tutorial_03;

import java.util.Scanner;

public class EuclideanDistance {

	public static void main(String[] args) {
		// declare the variables
		double x1, y1, x2, y2, euclidean_distance;
		Scanner input;
		
		// to prompt the user to enter x1, y1
		input = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		// to prompt the user to enter x2, y2
		input = new Scanner(System.in);
		System.out.print("Enter x2 and y2: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		// compute the energy
		euclidean_distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		
		// print out the answer
		System.out.println("The distance of the two points is: " + euclidean_distance);

	}

}
