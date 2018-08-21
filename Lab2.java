//Lab 2: Console Input/Output and Computation
//
// Write a java program that reads in the radius and length of a cylinder and computes the area and the volume using the following formulas:
// Area = radius * radius * pi (base of the cylinder)
// Volume = area * length

import java.util.Scanner; // Scanner is in the java.util package

public class Lab2 {
	public static void main(String[] args) {
		final double PI = 3.14159; //Declare PI as a constant
		
		Scanner input = new Scanner(System.in); //Create Scanner object
		
		System.out.print("Enter a value for the radius of the cylinder: "); //Prompt user for radius of cylinder
		double radius = input.nextDouble(); //Save number as radius
		
		System.out.print("Enter a value for the length of the cylinder: "); //Prompt user for length of cylinder
		double length = input.nextDouble(); // Save number as length
		
		double area = radius * radius * PI; //Compute area for the base of the cylinder
		double volume = area * length; //Compute volume of cylinder
		
		System.out.println("The area of the base of the cylinder is " + area +"."); //Prints area of the base of the cylinder
		System.out.println("The volume of the cylinder is " + volume + "."); //Prints volume of the cylinder	
		
		input.close(); //Closes input
	}
}