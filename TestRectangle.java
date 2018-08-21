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
 * 		return "The radius is:" + this.radius + "," + "The area is:" + this.getArea()”;
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

public class TestRectangle {

	public static void main(String[] args) {
		
		//objects
		Rectangle rectangle1 = new Rectangle(40, 4);
		Rectangle rectangle2 = new Rectangle(35.9, 3.5);
		Rectangle rectangle3 = new Rectangle();
	
		//display rectangle1
		System.out.println("The width is " + rectangle1.getWidth());
		System.out.println("The length is " + rectangle1.getLength());
		System.out.println("The area is " + rectangle1.getArea());
		System.out.println("The perimeter is " + rectangle1.getPerimeter());
			
		//display rectangle2
		System.out.println("The width is " + rectangle2.getWidth());
		System.out.println("The length is " + rectangle2.getLength());
		System.out.println("The area is " + rectangle2.getArea());
		System.out.println("The perimeter is " + rectangle2.getPerimeter());
		
		//display rectangle3
		System.out.println(rectangle3);
		
		//print out number of objects
		System.out.println("Number of Objects: " + rectangle3.getNumberOfObjects());
		
		//bonus
		//create rectangleArray with new rectangles
		Rectangle [] rectangleArray = new Rectangle [5];
		for (int i = 0; i < rectangleArray.length; i++) {
			rectangleArray[i] = new Rectangle(Math.random() * 100, Math.random() * 100);
		}
		
		//calculate areas and print sum
		double sum = 0;
		for (int i = 0; i < rectangleArray.length; i++) {
			sum += rectangleArray[i].getArea();
			System.out.println(rectangleArray[i].getArea());
		}
		
		System.out.println("The total area of the rectangles is " + sum);
		
	}

}
