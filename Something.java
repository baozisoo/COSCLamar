
public class Something {
	
public static void main(String[] args) {
		
		
		double [][] grades = new double [40][10];

				
		for (int student = 0; student < grades.length; student++) {
			for (int asmt = 0; asmt < grades[student].length; asmt++) {
				grades[student][asmt] = (int) (Math.random() * 100);
			}
		}	
		
		for (int i = 0; i < grades.length; i++) {
			double average;
			double sum = 0;
			for (int j = 0; j < grades[0].length; j++) {
				sum += grades[i][j];
			}
			average = sum / 10;
			System.out.println("Student " + i + "'s average: " + average);
		}
	}
}
