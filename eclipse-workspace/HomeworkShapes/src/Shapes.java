//My name is Rameez Hemani and this is homework 2
public class Shapes{ 
	public static void main(String[] args) {

	topBuild();
	base();
	shape2arrow();
	printNumbers();
	printEvens();
	printMultiples3();
	nestedforLoop();
	
	}
	public static void topBuild() {
		System.out.println("\t0");
		System.out.println("\t| \n\t|");
		System.out.println("\t| \n\t|");
		System.out.println("\t| \n\t|");
	
		int max= 9;
		for (int i=1; i<=max; i++) {
			for(int spaces= 1; spaces<= max-i; spaces++) {
				System.out.print(" ");
			}
			for(int dots=1; dots<=(2 * i -1); dots++) { 
				System.out.print(".");
		
			}System.out.println();
		
		
		} 
	
	}



	public static void base() {
		for(int b=1; b<=25; b++) {
			System.out.println("|\t|\t|");
		}
	
		for(int c=1; c<=17.5; c++) {
			System.out.print("-");
		}
		System.out.println();
	}
		 
	
		

	public static void shape2arrow() {
		System.out.println();
		int max= 9;
		for (int i=1; i<=max; i++) {
			for(int spaces= 1; spaces<= max-i; spaces++) {
				System.out.print(" ");
			}
			for(int dots=1; dots<=(2 * i -1); dots++) { 
				System.out.print("*");
			
			}System.out.println();
			for (int bottom=1; bottom<=max; bottom++) {
				for(int spacess= 1; spacess<=(9- max); spacess++) {
					System.out.print("o");
				}
			}
		} 
		System.out.println("\t|")	;
		System.out.println("\t|")	;
		System.out.println("\t|")	;
		System.out.println("\t|")	;
		System.out.println("\t|")	;
		System.out.println("\t|")	;
		System.out.println("\t|")	;
		System.out.println("\t|")	;
		System.out.println("\t|")	;
		System.out.println("\t|")	;
		
		
	
	}
	public static void printNumbers() {
		System.out.println();
		int highest=25;
		for(int q=1; q<=highest; q++) {
			System.out.print(q+",");
		}
	}
	public static void printEvens() {
		System.out.println();
		int maxeven = 25;
		for (int z= 1; z<=maxeven; z++) {
			System.out.print(z*2+",");
		}
	}
	public static void printMultiples3() {
		System.out.println();
		int threemax = 50;
		for (int x=3;x<=threemax;x=x+3) {
			System.out.print(x + ",");
		}
	}
	public static void nestedforLoop() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i=1;i<=5 ;i++ )
	    {
	        for(int j=5;j>=i;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i;k++)
	        {
	            System.out.print(i);
	        }
	        System.out.print("\n");
	    }
	}
	
}
	


