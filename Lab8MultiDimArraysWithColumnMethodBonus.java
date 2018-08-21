/* *****************************
 * Name: Cynthia Fu
 * Date: 07/18/2018
 * Course: COSC 1173
 * Lab 8: Multidimensional Arrays Bonus
 * *****************************
 * Topic: (Sum elements column by column)
 * Write a program that reads an 3 by 4 matrix and displays the sum of each column and each row separately.
 * Here is the sample run:
 * Enter a 3 by4 matrix row by row: 
 * 1.5 2 3 4 
 * 5.5 6 7 8 
 * 9.5 1 3 1 
 * Sum of the elements at column 0 is 16.5 
 * Sum of the elements at column 1 is 9.0 
 * Sum of the elements at column 2 is 13.0 
 * Sum of the elements at column 3 is 13.0 
 * Sum of the elements at Row 0 is: 10.5 
 * Sum of the elements at Row 0 is: 26.5 
 * Sum of the elements at Row 0 is: 14.5
 * 
 * Bonus: Rewrite your program with a method that returns the sum of all the
 * elements in a specified column in a matrix using the following header:
 * public static double sumColumn (double[][] m, int columnIndex) {
 * } 
 */

import java.util.Scanner;

public class Lab8MultiDimArraysWithColumnMethodBonus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//prompt user for 3 by 4 matrix
		System.out.println("Enter a 3 by 4 matrix row by row: ");
		double[][] matrix;
		matrix = new double [3][4];

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		
		//sum of each column printed out
		System.out.println("Sum of the elements in column 0: " + sumColumn(matrix, 0));
		System.out.println("Sum of the elements in column 1: " + sumColumn(matrix, 1));
		System.out.println("Sum of the elements in column 2: " + sumColumn(matrix, 2));
		System.out.println("Sum of the elements in column 3: " + sumColumn(matrix, 3));

		//sum of each row
		for (int row = 0; row < matrix.length; row++) {
			double totalRow = 0;
			for (int column = 0; column < matrix[row].length; column++) {
				totalRow += matrix[row][column];
			}
			System.out.println("Sum of the elements in row " + row + ": " + totalRow);
		}
		input.close();
	}

	//method for sum of each column
	public static double sumColumn (double[][] m, int columnIndex) {
		for (int column = columnIndex; column < m[0].length;) {
			double totalColumn = 0;
			for (int row = 0; row < m.length; row++) {
				totalColumn += m[row][column];
			}
			return totalColumn;
		}
		return columnIndex;
	}
}
