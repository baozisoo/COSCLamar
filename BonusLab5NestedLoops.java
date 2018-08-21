/*Name: Cynthia Fu
 * Class: COSC 1173
 * 
 * Bonus Lab 5: Nested Loops 
 *  
 * Use nested loops that display the following patterns in a single program:
 * Pattern 1: 4 lines of 9 asterisks each
 * *********
 * *********
 * *********
 * *********
 * Pattern 2: 1 to 5 asterisks
 * *
 * **
 * ***
 * ****
 * *****
 * Bonus Pattern: 12345 to 1
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */
public class BonusLab5NestedLoops {

	public static void main(String[] args) {
		
		//pattern 1
		int lines = 4; 
		for (int a = 1; a <= lines; ++a) {
			for (int b = 1; b <= 9; ++b) { //9 asterisks per line
				System.out.print("*");
			}
		System.out.println(""); //new line
		}
		
		//pattern 2
		int rows = 5;
	    for(int i = 1; i <= rows; ++i) {
	        for(int j = 1; j <= i; ++j) {
	          System.out.print("*");
	        }
	    System.out.println(""); //new line
	    }
	   
		//bonus pattern
	    int k, n;
	    for (k = 5; k >= 1; k--) {
	    	for (n = 1;n <= k; n++) {
	    		System.out.print(n);
	    	}
	    System.out.println(""); //new line
	    }	
	}
}
