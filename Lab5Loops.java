/*Name: Cynthia Fu
 * Class: COSC 1173
 * 
 * Lab 5: Loops
 * Write a program that displays the following table (note that 1 kilogram is 2.2 pounds).
 * Format your output (pounds) to one digit after the decimal place in the table.
 * Align each column and print out the table header including the dotted lines from your program.
 * 
 * Example:
 * ----------------------------------------
 * Kilograms Pounds
 * ----------------------------------------
 * 1 2.2 
 * 3 6.6 
 * 5 11.0 
 * ….. …
 * 197 433.4 
 * 199 437.8
 * --------------------------------------
 */
public class Lab5Loops {
	public static void main(String[] args) {
		
		//print out table header
		System.out.println("----------------------------------------");
		System.out.println(" Kilograms Pounds");
		System.out.println("----------------------------------------");
		
		//initialize variables
		int kilogram = 1;
		double pound = kilogram * 2.2;
		
		//table values
		while (kilogram < 200) {
			System.out.println("   " + String.format("%-8s", kilogram) + String.format("%.1f", pound)); //prints out result
			kilogram += 2; //maintains odd increase until 200
			pound = kilogram * 2.2; //pound value changes to match kilogram value
		}
		//table footer
		System.out.println("----------------------------------------");	
	}
}