/* Name: Cynthia Fu
 * Class: COSC 1173
 * 
 * Lab 6: Methods
 * 
 * Write a method to convert from Celsius to Fahrenheit using the following method header:
 * // convers from Celsius to Fahrenheit
 * public static double celsiusToFahrenheit (double celsius) 
 * The formula for the conversion is: Fahrenheit = ( 9/5) * Celsius +32
 * 
 * Write a test program that asks the user to input a Celsius value, invoke this method, then print out the corresponding Fahrenheit value.
 * Sample Run:
 * Please input the temperature in Celsius: 32 
 * 32 Celsius equals to 89.6 Fahrenheit. 
 * 
 * Bonus
 * Write a test program that invokes this method several times to display the following tables using loops:
 * Celsius Fahrenheit (later formatted)
 * 40.0 104.0 
 * 39.0 102.2
 * … …
 * 32.0 89.6
 * 31.0 87.8
 */

import java.util.Scanner;

public class Lab6Methods {
	
	// convert from Celsius to Fahrenheit
	public static double celsiusToFahrenheit (double celsius) {
		double fahrenheit = (9.0/5) * celsius + 32.0; 
		return fahrenheit;
	}	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for temp in Celsius
		System.out.print("Please input the temperature in degrees Celsius: ");
		double celsius = input.nextDouble();
		System.out.println(celsius + " degrees Celsius equals to " + celsiusToFahrenheit(celsius) + " degrees Fahrenheit."); //print result
		
		input.close();
		
		System.out.println(); //spacer to separate bonus
		//bonus portion
		System.out.println("Celsius        Fahrenheit"); //table header
		
		for (celsius = 40.0; celsius > 30.0; celsius--) { //loop 40 to 31
			System.out.println(String.format("%-15s", celsius) + String.format("%.1f", celsiusToFahrenheit(celsius)));
		}
	}
}