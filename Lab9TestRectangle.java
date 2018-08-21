/* *****************************
 * Name: Cynthia Fu
 * Date: 08/01/2018
 * Course: COSC 1173
 * Lab 9: Objects and Class
 * *****************************
 * Refer to the example code of the Circle class in Chapter 8.2, design a class named Rectangle to represent a rectangle.
 * The class contains:
 * Two double data fields named width and length that specify the width and length of the rectangle.
 * The default values are 0.0 for both width and length. 
 * A no-arg constructor that creates a default rectangle. 
 * A constructor that creates a rectangle with the specified width and length. 
 * A method named getArea() that returns the area of this rectangle. 
 * A method named getPerimeter() that returns the perimeter. 
 * Accessor and Mutator methods for length and width; 
 * Make sure that your constructors and mutator methods can check the new length and width to make sure only positive values can be used in your code, 
 * otherwise print out error message to the user.
 * 
 * Create your own project in Eclipse, add a test class with main method as usual first.
 * Then add another new class called Rectangle without the main method in the same project.
 * Now you should have two class files in your project. Implement the Rectangle class first. 
 * In your test class main method, creates two Rectangle objects—one with width 4 and length 40 and the other with width 3.5 and length 35.9.
 * Display the width, length, area, and perimeter of each rectangle in this order.
 */

public class Lab9TestRectangle {

	public static void main(String[] args) {
		Lab9Rectangle rectangle1 = new Lab9Rectangle(3, 4);

		System.out.println("The length is " + rectangle1.getLength());
		System.out.println("The width is " + rectangle1.getWidth());
		System.out.println("The area is " + rectangle1.getArea());
		System.out.println("The perimeter is " + rectangle1.getPerimeter());
		rectangle1.printRectangle();
	}

}
