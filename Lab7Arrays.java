/* ****************************
 * COSC 1173 Programming Lab 
 * Name: Cynthia Fu 
 * Date: 07/18/2018
 * Purpose: Lab 7 - reversing order of numbers in an array
 * **************************** 
 * Lab 7: Array Basics
 * Programming Question: Reverse Order 
 * Write a program that reads ten integers into an array; 
 * define another array to save those ten numbers in the reverse order. 
 * Display the original array and new array. 
 * Then define two separate methods to compute the maximum number and minimum number of the array.
 * 
 * Sample Run: 
 * Please enter 10 numbers: 1 3 5 8 2 -7 6 100 34 20 
 * The new array is: 20 34 100 6 -7 2 8 5 3 1 
 * The maximum is: 100 
 * The minimum is: -7 
 * 
 * Bonus: 
 * Determine how many numbers are above or equal to the average and how many numbers are below the average. 
 */

import java.util.Scanner;

public class Lab7Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//prompt user for 10 numbers
		System.out.print("Please enter 10 numbers: ");
		
		//store numbers in new array
		double [] list = new double [10];
		int i = 0;
		for (i = 0; i < list.length; i++) {
			list[i] = input.nextDouble();
		}

		//swap values in array
		for (i = 0; i < list.length/2; i++) {
			double temp = list[i];
			list[i] = list[list.length - i - 1];
			list[list.length - 1 - i] = temp;
		}

		//print new array
		System.out.print("The new array is: ");
		for (i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

		System.out.println();

		//print max
		double max = list[0];

		for (i = 1; i < list.length; i++)
			if (list[i] > max) {
				max = list[i];
			}
		System.out.println("The maximum is : " + max);

		//print min
		double min = list[0];

		for (i = 1; i < list.length; i++)
			if (list[i] < min) {
				min = list[i];
			}
		System.out.println("The minimum is : " + min);
		
		input.close();

		//bonus portion
		
		//calculate sum
		double sum = 0;

		for (i = 0; i < list.length; i++) {
			sum += list[i];
		}

		//compute average
		double average = sum / list.length;

		//above/equal or below average
		int aboveAvg = 0, belowAvg = 0;
		
		for (i = 0; i < list.length; i++) {
			//numbers above or equal to
			if (list[i] >= average) {
				aboveAvg++;
			}
			//numbers below	
			else {
				belowAvg++;
			}
		}
		
		//print above/equal and below average
		System.out.println("There are " + aboveAvg + " numbers that are above or equal to the average.");
		System.out.println("There are " + belowAvg + " numbers that are below the average.");
	}

}
