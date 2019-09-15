package tutorial_03;

import java.util.Scanner;

public class DigitsSummation {

	public static void main(String[] args) {
		// declare the variables
		int number, digits_sum;
		Scanner input;
		
		// to prompt the user to enter an integer between 0 and 1000
		input = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000: ");
		number = input.nextInt();
		System.out.println(number);

		/* compute the digits summation
		 * because 0 <= number <= 1000, number can be written in the form of 4-digits integer: abcd
		 * d = number % 10
		 * abc = number / 10
		 * c = abc % 10
		 * ab = abc / 10
		 * b = ab % 10
		 * a = ab / 10
		 * digits_sum = a + b + c + d
		 * */
		// compute the digits summation
		int d = number % 10;
		int abc = number / 10;
		int c = abc % 10;
		int ab = abc / 10;
		int b = ab % 10;
		int a = ab / 10;
		digits_sum = a + b + c + d;
		
		// print out the answer
		System.out.println("The digits summation of given integer: " + digits_sum);

	}

}
