package tutorial_04;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		// declare the variables
		double x, y, z;
		Scanner input;
		
		// to prompt the user's values
		input = new Scanner(System.in);
		System.out.print("Enter x, y, z: ");
		x = input.nextDouble();
		y = input.nextDouble();
		z = input.nextDouble();
		
		// Compute the median
		if (x >= y) {
			if (y >= z) {
				System.out.println("Median = " + y);
			}else { //x >= y, z >= y
				if (x >= z) {
					System.out.println("Median = " + z);
				}else {
					System.out.println("Median = " + x);
				}
			}
		}else { // y >= x
			if (x >= z) {
				System.out.println("Median = " + x);
			}else {  // y >= x, z >= x
				if (y >= z) {
					System.out.println("Median = " + z);
				}else {
					System.out.println("Median = " + y);
				}
			}
		}

	}

}
