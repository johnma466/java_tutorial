package tutorial_04;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// declare the variables
		int program_number, user_number;
		String program_symbol, user_symbol, result;
		Scanner input;
				
		// The program randomly generates a number 0, 1, 2 representing paper, scissor and rock
		/* Math.random(): return a random number in range [0, 1)
		 * Math.random() * 3: return a random number in range [0, 3)
		 * (int)(x): get the floor of x
		 * */
		program_number = (int)(Math.random() * 3);
		
		// to prompt the user's value
		input = new Scanner(System.in);
		System.out.print("paper (0), scissor (1), rock (2): ");
		user_number = input.nextInt();
		
		//Get program's symbol
		if (program_number == 0) {
			program_symbol = "paper";
		}else if (program_number == 1) {
			program_symbol = "scissor";
		}else {
			program_symbol = "rock";
		}
		
		//Get user's symbol
		if (user_number == 0) {
			user_symbol = "paper";
		}else if (user_number == 1) {
			user_symbol = "scissor";
		}else {
			user_symbol = "rock";
		}
		
		//Compute the result
		if (user_number == program_number) {
			result = "draw";
			
		}else if (user_number < program_number) {
			if (user_number + 1 == program_number) {
				result = "lose";
			}else {
				result = "win";
			}
			
		}else {
			if (program_number + 1 == user_number) {
				result = "win";
			}else {
				result = "lose";
			}
		}
		
		//show the result
		System.out.print("The computer is " + program_symbol + ". ");
		System.out.print("You are " + user_symbol + ". ");
		if (result == "draw") {
			System.out.println("It's draw.");
		}else {
			System.out.println("You " + result);
		}

	}

}
