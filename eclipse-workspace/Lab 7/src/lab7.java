// Rameez Hemani, and this is lab 7
import java.util.*;
public class lab7 {

	



	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Please enter your full name: ");
		String name = console.nextLine();
		String last=name.substring(name.indexOf(" ")+1);
		String first = name.substring(0,name.indexOf(" "));
		

	    System.out.print("Your name in reverse order is: "+ last+", " + first);
		
		
	}

	
}
		

