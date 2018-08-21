/* Name: Cynthia Fu
 * Class: COSC 1173
 * Lab 3 Part 2 Selection
 * 
 * Write a program that randomly generates an integer between 1 and 12 and displays the English month names January,
February,…, December for the number 1, 2, … 12 using switch-case statement. Print out the random number and the English name. 
*/

public class Lab3Selection2 {
	public static void main(String[] args) {
		
		//generate random number 1-12 and print it out
		int number = (int)(Math.random() * 12 + 1);
		System.out.println("The random number is " + number + ".");
		
		//assign month to number and print out month
		switch (number) {
		case 1: System.out.println("It is January."); break;
		case 2: System.out.println("It is February."); break;
		case 3: System.out.println("It is March."); break;
		case 4: System.out.println("It is April."); break;
		case 5: System.out.println("It is May."); break;
		case 6: System.out.println("It is June."); break;
		case 7: System.out.println("It is July."); break;
		case 8: System.out.println("It is August."); break;
		case 9: System.out.println("It is September."); break;
		case 10: System.out.println("It is October."); break;
		case 11: System.out.println("It is November."); break;
		case 12: System.out.println("It is December."); break;
		}
	}
}