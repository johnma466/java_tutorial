package tutorial_03;

import java.util.Scanner;

public class CalculatingEnergy {

	public static void main(String[] args) {
		// declare the variables
		double energy, water_weight, initial_temperature, final_temperature;
		Scanner input;
		
		// to prompt the user to enter the amount of water
		input = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		water_weight = input.nextDouble();
		
		// to prompt ... initial temperature
		input = new Scanner(System.in);
		System.out.print("Enter the initial temperature: ");
		initial_temperature = input.nextDouble();
		
		// to prompt ... final temperature
		input = new Scanner(System.in);
		System.out.print("Enter the final temperature: ");
		final_temperature = input.nextDouble();

		// compute the energy
		energy = water_weight * (final_temperature - initial_temperature) * 4184;
		
		// print out the answer
		System.out.println("The energy needed is: " + energy);

	}

}
