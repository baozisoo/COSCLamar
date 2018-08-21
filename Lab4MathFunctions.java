/* Name: Cynthia Fu
 * Class: COSC 1173
 * 
 * Lab 4: Math Functions
 * Write a program that prompts that user to enter the side of a hexagon and displays its area.
 */
import java.util.Scanner;

public class Lab4MathFunctions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		//prompt user for side
		System.out.print("Enter the side length of a hexagon: ");
		double length = input.nextDouble();
		
		//calculate hexagon area
		double area = (6 * length * length)/(4* Math.tan(Math.PI/6));
		System.out.println("The area of the hexagon is " + area);
		
		input.close();
	}
}