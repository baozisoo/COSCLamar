/* Name: Cynthia Fu
 * Class: COSC 1173
 * Lab 3 - Selection
 * 
 * A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the weight of the package (in pounds)
 * 3.5 0-1 (upper bounds inclusive)
 * 5.5 1-3
 * 8.5 3-10 
 * 10.5 10-20
 * 
 * Write a program that prompts the user to enter the weight of the package and the price of the product, then display the shipping cost and total bill. 
 * If the weight is greater than 20, display a message “the package cannot be shipped”. 
 * If the user input invalid numbers (negative numbers for the weight and price), display the message “The weight/Price cannot be negative”. 
 */
import java.util.Scanner; //Scanner is in java.util

public class Lab3Selection1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package and the price of the product: ");
		double weight = input.nextDouble();
		double price = input.nextDouble();
		
		//negative weight
		if (weight < 0) {
			System.out.println("The weight cannot be negative.");
		}
		
		else if (weight <= 1) {
			price += 3.5;
			System.out.println("The shipping cost is $3.50 and the total bill is " + "$" + price);
		}
		else if (weight <= 3) {
			price += 5.5;
			System.out.println("The shipping cost is $5.50 and the total bill is $" + price);
		}
		else if (weight <= 10) {
			price += 8.5;
			System.out.println("The shipping cost is $8.50 and the total bill is $" + price);
		}
		else if (weight <= 20) {
			price += 10.5;
			System.out.println("The shipping cost is $10.50 and the total bill is $" + price);
		}
		else {
		System.out.println("The package cannot be shipped.");
		}
	input.close();
	}
}