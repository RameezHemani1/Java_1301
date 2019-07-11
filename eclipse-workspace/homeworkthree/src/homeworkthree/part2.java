package homeworkthree;

import java.util.Scanner;

// Rameez Hemani this is homework three question3.

public class part2 {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter the radius: ");
	int circle= in.nextInt();
	
	
	double radius = circle;
	double area = Math.PI*radius*radius;
	double perimeter = 2*Math.PI*radius;
	
	System.out.printf("Area=  %.4f\n", area);
	System.out.printf("Perimeter=  %.4f\n", perimeter);
	
	
	
	

	}

}
