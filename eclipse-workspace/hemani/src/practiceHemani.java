//Rameez Hemani. This is homework 3. this is questions 1 and 2
import java.util.*;
public class practiceHemani {

	public static void main(String[] args) {
	
	printGrid(5,6);
	System.out.println();
	Scanner console = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String sentence= console.nextLine();
	String output[]=sentence.split("");
	for(int a = output.length-1; a>=0; a--) {
		System.out.print(output[a]);
	
		
	
	
	
	
		
	
	}
	}

	
	public static void printGrid(int row, int column) {
    
        for (int i = 1; i <= row; i++) {
        	for (int j = i; j <= row * column; j += 5) {
            
                System.out.print(j+" ");
            }
            System.out.println();
 
        }
 
    }
	


}