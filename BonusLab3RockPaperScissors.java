/* Name: Cynthia Fu
 * Class: COSC 1173 
 * Bonus Lab 3: Rock, Paper, Scissors 
 * 
 * Add statements to the program as indicated by the comments so that the program asks the user to enter a number 0, 1, 2 representing scissor, rock, and paper, and generates
a random play for the computer, compares them and announces the winner (and why). 
 */

import java.util.Scanner;
public class BonusLab3RockPaperScissors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// begin game
		System.out.println("Let's play Rock, Paper, Scissors!");
		
		// Prompt to let the user input Scissor (0), rock(1), paper (2) .
		System.out.print("Enter a number Scissor (0), Rock(1), Paper (2): ");;
		
		// read in user input number and save it in a variable named personalPlay
		int personalPlay = input.nextInt();
		
		//Generate computer's play (0,1,2) using Math.random() and save to a variable named computerPlay
		int computerPlay = (int) (Math.random() * 2);
		
		//print what the computer plays
		if (computerPlay == 0)
			System.out.println("The computer plays scissors.");
		else if (computerPlay == 1)
			System.out.println("The computer plays rock.");
		else
			System.out.println("The computer plays paper.");
		
		//See who won and why. Use nested if's instead of &&.
		if (personalPlay == computerPlay)
			System.out.println("It's a tie!");
		else if (personalPlay == 0)
			if (computerPlay == 1)
				System.out.println("Rock crushes Scissors. You lose!");
			else
				System.out.println("Scissors cut Paper. You win!");
		else if (personalPlay == 1)
			if (computerPlay == 0)
				System.out.println("Rock crushes Scissors. You win!");
			else
				System.out.println("Paper covers Rock. You lose!");
		else if (personalPlay == 2)
			if (computerPlay == 0)
				System.out.println("Scissors cut Paper. You lose!");
			else System.out.println("Paper covers Rock. You win!");

		 input.close();
	}
}