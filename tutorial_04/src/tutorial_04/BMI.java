package tutorial_04;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		/*ref: https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/index.html
		 * < 16: serious underweight
		 * 16 <= bmi < 18.5: underweight
		 * 18.5 <= bmi < 25: normal weight
		 * 25 <= bmi < 30: overweight
		 * 30 <= bmi < 35: seriously overweight
		 * bmi >= 35: gravely overwieght
		 * */
		
		// declare the variables
		double weight, height, bmi;
		Scanner input;
		
		// to prompt the user's values
		input = new Scanner(System.in);
		System.out.print("Enter weight (in kg), height (in m): ");
		weight = input.nextDouble();
		height = input.nextDouble();
		
		//caculate bmi index
		bmi = weight / Math.pow(height, 2);
		bmi = Math.round(bmi * 100.0) / 100.0;

		//show the result
		System.out.println("Your BMI is " + bmi);
		if (bmi < 16) {
			System.out.println("You are serious underweight");
			
		} else if (bmi < 18.5) {
			System.out.println("You are underweight");
			
		}else if (bmi < 25) {
			System.out.println("You are normal weight");
			
		}else if (bmi < 30) {
			System.out.println("You are overweight");
			
		}else if (bmi < 35) {
			System.out.println("You are seriously overweight");
			
		}else {
			System.out.println("You are gravely overweight");
		}
	}

}
