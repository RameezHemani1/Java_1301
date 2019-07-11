package lab8;

// Lab 8. Rameez Hemani
import java.util.*; 




public class Lab8 {

	public static void main(String[] args) {
	
	Scanner console = new Scanner(System.in);
	
	System.out.println("Enter three numbers: ");
	
	int first= console.nextInt();
	int second= console.nextInt();
	int third= console.nextInt();
	evenorOdd(first,second,third);
	System.out.println();
	System.out.println(median(first,second,third)); 
	
	System.out.println();
	Scanner three = new Scanner(System.in);
	System.out.println("Enter (x,y)");
	System.out.println("Number x: ");
	int x = three.nextInt();
	System.out.println("Number y: ");
	int y = three.nextInt();
	
	printRange(x,y);
	
	System.out.println();
	
	Scanner hello = new Scanner(System.in);
	System.out.print("Enter one or more words: ");
	String word = hello.nextLine();
	
	printPalindrome(hello, word); 
	
	}


	public static void printPalindrome(Scanner hello, String word) {
		String reverse = "";
		int length = word.length();
		for (int i=length-1;i>=0; i--) {
			reverse = reverse + word.charAt(i);
			
		}
		word.equalsIgnoreCase(reverse);
		if(word.equals(reverse)) {
			System.out.println("Yes, it is a palindrome");
		}
		else {
			System.out.println("No, not a palindrome");
		}
		
		
		
	}


	public static void printRange(int x, int y) {
		if(y  > x) {
		    for (int  j = x; j <= y; j++) {
		    
		        System.out.print(j + " ");
		    }
		  } 
		  else if (x > y){
		    for (int j = x; j>= y; j--) {
		        
		        System.out.print(j + ", ");
		    }
		  } 
		  else {
		    System.out.print(x);
		  }
		}
    		  		
	


	public static void evenorOdd(int first, int second, int third) {
		if (first % 2 == 0) {
			System.out.println("First number is even");
		}
		else {
			System.out.println("First number is odd");
		}
		if (second % 2 == 0) {
			System.out.println("First number is even");
		}
		else {
			System.out.println("First number is odd");
		}
		if (third % 2 == 0) {
			System.out.println("First number is even");
		}
		else {
			System.out.println("First number is odd");
		}
	}		
	
	public static double median(int first, int second, int third) {
		
		return (first+second+third)/3.0;

	}
	
}	 
