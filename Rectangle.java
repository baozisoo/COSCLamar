/* *****************************
 * Name: Cynthia Fu
 * Date: 08/09/2018
 * Course: COSC 1173
 * Lab 10: Objects and Class Continued
 * *****************************
 * One integer data field named numberOfObjects that specify the number of objects that the rectangle class 
 * created in test program, refer to the circle class on textbook.
 * 
 * A method called toSting() that returns a string that is one line description of each rectangle class.
 * Here is an example of toString() for Circle class. 
 * -------------------------- 
 * public String toString() {
 * 		return "The radius is:" + this.radius+","+"The area is:" +this.getArea()”;
 * }
 * --------------------------
 * // here is the statement that use this toString() method in test program.
 * Circle c1 = new Circle(); 
 * System.out.println(c1); 
 * 
 * Modify your test program so that it will use the toString() method and print out the number of objects created by test program.
 * 
 * Bonus (20 points): Declares and creates an array of five Rectangle objects in your test program, 
 * initialize rectangle length and width use any number you want, 
 * then calculate the total area of the rectangles in the array. (Refer to sample code on our textbook). 
*/

public class Rectangle {
	
	private double length;
	private double width;
	private static int numberOfObjects = 0;
	
	//no-arg constructor
	public Rectangle() {
		length = 0.0;
		width = 0.0;
		numberOfObjects++;
	}
	
	//constructor	
	public Rectangle(double newLength, double newWidth) {
		if (newLength > 0 && newWidth > 0) {
			this.length = newLength;
			this.width = newWidth;
			numberOfObjects++;
		}
		else if (newLength <= 0) {
			System.out.println("The length cannot be 0 or negative");
		}
		else {
			System.out.println("The width cannot be 0 or negative");
		}
	}
	
	//calculate area
	double getArea() {
		return length * width;
	}
	
	//calculate perimeter
	double getPerimeter() {
		return 2 * length + 2 * width;
	}
	
	//return length
	double getLength() {
		return length;
	}
	
	//return width
	double getWidth() {
		return width;
	}
	
	//set new length
	public void setLength(double newLength) {
		if (newLength > 0)
			this.length = newLength;
		else
			System.out.println("Length must be greater than 0.");
	}
	
	//set new width
	public void setWidth(double newWidth) {
		if (newWidth > 0)
			this.length = newWidth;
		else
			System.out.println("Width must be greater than 0.");
	}
	
	int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	//print rectangle info
	public void printRectangle() {
		System.out.println("The length of the rectangle is: " + length +
				" and the width of the rectangle is: " + width);
	}
	
	//toString class
	public String toString() {
		return "The length is: " + this.length + ", " + "The width is: " + this.width + ", " + "The area is: " + this.getArea();
	}
	

}